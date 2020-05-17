package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'complete_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
  */
@js.native
trait ICompleteReplyMsg
  extends IShellMessage[complete_reply]
     with Message {
  @JSName("content")
  var content_ICompleteReplyMsg: ReplyContent[ICompleteReply] = js.native
  @JSName("parent_header")
  var parent_header_ICompleteReplyMsg: IHeader[complete_request] = js.native
}

object ICompleteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  @scala.inline
  implicit class ICompleteReplyMsgOps[Self <: ICompleteReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[ICompleteReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[complete_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

