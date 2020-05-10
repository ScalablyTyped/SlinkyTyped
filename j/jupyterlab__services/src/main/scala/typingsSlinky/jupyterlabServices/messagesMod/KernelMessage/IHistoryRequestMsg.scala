package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'history_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReplyMsg]], [[[IKernel.history]]]
  */
@js.native
trait IHistoryRequestMsg
  extends IShellMessage[history_request]
     with _Message {
  @JSName("content")
  var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail = js.native
}

object IHistoryRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestMsg]
  }
  @scala.inline
  implicit class IHistoryRequestMsgOps[Self <: IHistoryRequestMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

