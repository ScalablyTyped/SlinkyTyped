package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryReplyMsg
  extends IShellMessage[history_reply]
     with _Message {
  
  @JSName("content")
  var content_IHistoryReplyMsg: ReplyContent[IHistoryReply] = js.native
  
  @JSName("parent_header")
  var parent_header_IHistoryReplyMsg: IHeader[history_request] = js.native
}
object IHistoryReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReplyMsg]
  }
  
  @scala.inline
  implicit class IHistoryReplyMsgMutableBuilder[Self <: IHistoryReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IHistoryReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[history_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
