package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'kernel_info_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
@js.native
trait IInfoReplyMsg
  extends IShellMessage[kernel_info_reply]
     with Message {
  @JSName("content")
  var content_IInfoReplyMsg: ReplyContent[IInfoReply] = js.native
  @JSName("parent_header")
  var parent_header_IInfoReplyMsg: IHeader[kernel_info_request] = js.native
}

object IInfoReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request]
  ): IInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReplyMsg]
  }
  @scala.inline
  implicit class IInfoReplyMsgOps[Self <: IInfoReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[IInfoReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[kernel_info_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

