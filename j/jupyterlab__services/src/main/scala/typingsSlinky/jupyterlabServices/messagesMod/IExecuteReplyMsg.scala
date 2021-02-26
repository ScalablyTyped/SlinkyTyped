package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteReplyMsg
  extends IShellMessage[execute_reply]
     with _Message {
  
  @JSName("content")
  var content_IExecuteReplyMsg: ReplyContent[IExecuteReply] with IExecuteCount = js.native
  
  @JSName("parent_header")
  var parent_header_IExecuteReplyMsg: IHeader[execute_request] = js.native
}
object IExecuteReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IExecuteReply] with IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request]
  ): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
  
  @scala.inline
  implicit class IExecuteReplyMsgMutableBuilder[Self <: IExecuteReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IExecuteReply] with IExecuteCount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[execute_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
