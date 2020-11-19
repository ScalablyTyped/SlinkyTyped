package typingsSlinky.cloudeventsSdk.receiverStructuredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import("../../cloudevent")} CloudEvent */
/**
  * A utility class used to receive structured CloudEvents
  * over HTTP.
  * @see {StructuredReceiver}
  */
@js.native
trait StructuredHTTPReceiver extends js.Object {
  
  /**
    * Checks whether the provided payload and headers conform to the Cloud Events
    * specification version supported by this instance.
    *
    * @param {object} payload the cloud event data payload
    * @param {object} headers the HTTP headers received for this cloud event
    * @returns {boolean} true if the payload and header combination are valid
    * @throws {ValidationError} if the payload and header combination do not conform to the spec
    */
  def check(payload: js.Object, headers: js.Object): Boolean = js.native
  
  /**
    * Creates a new CloudEvent instance based on the provided payload and headers.
    *
    * @param {object} payload the cloud event data payload
    * @param {object} headers  the HTTP headers received for this cloud event
    * @returns {CloudEvent} a new CloudEvent instance for the provided headers and payload
    * @throws {ValidationError} if the payload and header combination do not conform to the spec
    */
  def parse(payload: js.Object, headers: js.Object): CloudEvent = js.native
  
  var receiver: typingsSlinky.cloudeventsSdk.receiverStructured1Mod.^  | typingsSlinky.cloudeventsSdk.receiverStructured03Mod.^  = js.native
}
object StructuredHTTPReceiver {
  
  @scala.inline
  def apply(
    check: (js.Object, js.Object) => Boolean,
    parse: (js.Object, js.Object) => CloudEvent,
    receiver: typingsSlinky.cloudeventsSdk.receiverStructured1Mod.^  | typingsSlinky.cloudeventsSdk.receiverStructured03Mod.^ 
  ): StructuredHTTPReceiver = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check), parse = js.Any.fromFunction2(parse), receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredHTTPReceiver]
  }
  
  @scala.inline
  implicit class StructuredHTTPReceiverOps[Self <: StructuredHTTPReceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheck(value: (js.Object, js.Object) => Boolean): Self = this.set("check", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParse(value: (js.Object, js.Object) => CloudEvent): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReceiver(
      value: typingsSlinky.cloudeventsSdk.receiverStructured1Mod.^  | typingsSlinky.cloudeventsSdk.receiverStructured03Mod.^ 
    ): Self = this.set("receiver", value.asInstanceOf[js.Any])
  }
}
