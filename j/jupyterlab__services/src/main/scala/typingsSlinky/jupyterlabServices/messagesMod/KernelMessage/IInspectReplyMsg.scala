package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'inspect_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
  *
  * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
  */
@js.native
trait IInspectReplyMsg
  extends IShellMessage[inspect_reply]
     with Message {
  @JSName("content")
  var content_IInspectReplyMsg: ReplyContent[IInspectReply] = js.native
  @JSName("parent_header")
  var parent_header_IInspectReplyMsg: IHeader[inspect_request] = js.native
}

object IInspectReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReplyMsg]
  }
  @scala.inline
  implicit class IInspectReplyMsgOps[Self <: IInspectReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[IInspectReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[inspect_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

