package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.CodeString
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIsCompleteRequestMsg
  extends IShellMessage[is_complete_request]
     with _Message {
  
  @JSName("content")
  var content_IIsCompleteRequestMsg: CodeString = js.native
}
object IIsCompleteRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: CodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IIsCompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteRequestMsg]
  }
  
  @scala.inline
  implicit class IIsCompleteRequestMsgMutableBuilder[Self <: IIsCompleteRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: CodeString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
