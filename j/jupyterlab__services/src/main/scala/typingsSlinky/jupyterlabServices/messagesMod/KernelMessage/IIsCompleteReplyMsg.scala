package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'is_complete_reply'` message on the `'stream'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
  *
  * **See also:** [[IIsCompleteRequest]], [[IKernel.isComplete]]
  */
@js.native
trait IIsCompleteReplyMsg
  extends IShellMessage[is_complete_reply]
     with _Message {
  @JSName("content")
  var content_IIsCompleteReplyMsg: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther] = js.native
  @JSName("parent_header")
  var parent_header_IIsCompleteReplyMsg: IHeader[is_complete_request] = js.native
}

object IIsCompleteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyMsg]
  }
  @scala.inline
  implicit class IIsCompleteReplyMsgOps[Self <: IIsCompleteReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[is_complete_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

