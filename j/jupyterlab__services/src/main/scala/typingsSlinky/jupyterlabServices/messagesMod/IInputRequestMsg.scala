package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Password
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputRequestMsg
  extends IStdinMessage[input_request]
     with _Message {
  
  @JSName("content")
  var content_IInputRequestMsg: Password = js.native
}
object IInputRequestMsg {
  
  @scala.inline
  def apply(
    channel: stdin,
    content: Password,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputRequestMsg]
  }
  
  @scala.inline
  implicit class IInputRequestMsgMutableBuilder[Self <: IInputRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Password): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
