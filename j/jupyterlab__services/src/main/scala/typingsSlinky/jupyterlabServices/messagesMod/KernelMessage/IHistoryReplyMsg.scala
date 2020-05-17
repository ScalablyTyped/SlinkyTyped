package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'history_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryRequest]], [[IKernel.history]]
  */
@js.native
trait IHistoryReplyMsg
  extends IShellMessage[history_reply]
     with Message {
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
  implicit class IHistoryReplyMsgOps[Self <: IHistoryReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[IHistoryReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[history_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

