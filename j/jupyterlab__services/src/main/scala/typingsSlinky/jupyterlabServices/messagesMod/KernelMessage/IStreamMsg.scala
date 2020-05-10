package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonName
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stream
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'stream'` message on the `'iopub'` channel.
  *
  * See [Streams](https://jupyter-client.readthedocs.io/en/latest/messaging.html#streams-stdout-stderr-etc).
  */
@js.native
trait IStreamMsg
  extends IIOPubMessage[stream]
     with _Message {
  @JSName("content")
  var content_IStreamMsg: AnonName = js.native
}

object IStreamMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonName,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStreamMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamMsg]
  }
  @scala.inline
  implicit class IStreamMsgOps[Self <: IStreamMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

