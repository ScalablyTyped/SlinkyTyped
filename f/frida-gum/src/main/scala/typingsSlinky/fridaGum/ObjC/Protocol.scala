package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fridaGum.NativePointer
import typingsSlinky.fridaGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C protocol.
  */
@js.native
trait Protocol extends ObjectWrapper {
  /**
    * Methods declared by this protocol.
    */
  var methods: StringDictionary[ProtocolMethodDescription] = js.native
  /**
    * Name visible to the Objective-C runtime.
    */
  var name: String = js.native
  /**
    * Properties declared by this protocol.
    */
  var properties: StringDictionary[ProtocolPropertyAttributes] = js.native
  /**
    * Protocols that this protocol conforms to.
    */
  var protocols: StringDictionary[Protocol] = js.native
}

object Protocol {
  @scala.inline
  def apply(
    handle: NativePointer,
    methods: StringDictionary[ProtocolMethodDescription],
    name: String,
    properties: StringDictionary[ProtocolPropertyAttributes],
    protocols: StringDictionary[Protocol]
  ): Protocol = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: StringDictionary[ProtocolMethodDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[ProtocolPropertyAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocols(value: StringDictionary[Protocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

