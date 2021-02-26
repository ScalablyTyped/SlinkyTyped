package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Code
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompleteRequestMsg
  extends IShellMessage[complete_request]
     with _Message {
  
  @JSName("content")
  var content_ICompleteRequestMsg: Code = js.native
}
object ICompleteRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
  
  @scala.inline
  implicit class ICompleteRequestMsgMutableBuilder[Self <: ICompleteRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Code): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
