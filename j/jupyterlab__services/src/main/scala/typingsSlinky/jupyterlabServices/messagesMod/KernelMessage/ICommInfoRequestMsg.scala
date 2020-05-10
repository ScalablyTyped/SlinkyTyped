package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonTarget
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_info_request'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
  *
  * **See also:** [[ICommInfoReplyMsg]], [[IKernel.commInfo]]
  */
@js.native
trait ICommInfoRequestMsg
  extends IShellMessage[comm_info_request]
     with _Message {
  @JSName("content")
  var content_ICommInfoRequestMsg: AnonTarget = js.native
}

object ICommInfoRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: AnonTarget,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoRequestMsg]
  }
  @scala.inline
  implicit class ICommInfoRequestMsgOps[Self <: ICommInfoRequestMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

