package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_reply'` message on the `'stream'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
  *
  * **See also:** [[IExecuteRequest]], [[IKernel.execute]]
  */
@js.native
trait IExecuteReplyMsg
  extends IShellMessage[execute_reply]
     with Message {
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
  implicit class IExecuteReplyMsgOps[Self <: IExecuteReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReplyContent[IExecuteReply] with IExecuteCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[execute_request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

