package typingsSlinky.awsSdkClientS3Node.typesRecordsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordsEvent extends js.Object {
  
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  var Payload: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
}
object RecordsEvent {
  
  @scala.inline
  def apply(): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordsEvent]
  }
  
  @scala.inline
  implicit class RecordsEventOps[Self <: RecordsEvent] (val x: Self) extends AnyVal {
    
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
    def setPayloadArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
  }
}
