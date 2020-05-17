package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Code
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A  `'complete_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteReplyMsg]], [[IKernel.complete]]
  */
@js.native
trait ICompleteRequestMsg
  extends IShellMessage[complete_request]
     with Message {
  @JSName("content")
  var content_ICompleteRequestMsg: Code = js.native
}

object ICompleteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
  @scala.inline
  implicit class ICompleteRequestMsgOps[Self <: ICompleteRequestMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

