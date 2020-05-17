package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Metadata
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.display_data
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'display_data'` message on the `'iopub'` channel.
  *
  * See [Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#display-data).
  */
@js.native
trait IDisplayDataMsg
  extends IIOPubMessage[display_data]
     with Message {
  @JSName("content")
  var content_IDisplayDataMsg: Metadata = js.native
}

object IDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayDataMsg]
  }
  @scala.inline
  implicit class IDisplayDataMsgOps[Self <: IDisplayDataMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

