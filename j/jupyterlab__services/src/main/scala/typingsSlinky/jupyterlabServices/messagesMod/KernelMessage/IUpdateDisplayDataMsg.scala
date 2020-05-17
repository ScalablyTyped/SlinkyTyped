package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Metadata
import typingsSlinky.jupyterlabServices.anon.TransientDisplayidString
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'update_display_data'` message on the `'iopub'` channel.
  *
  * See [Update Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#update-display-data).
  */
@js.native
trait IUpdateDisplayDataMsg
  extends IIOPubMessage[update_display_data]
     with Message {
  @JSName("content")
  var content_IUpdateDisplayDataMsg: Metadata with TransientDisplayidString = js.native
}

object IUpdateDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Metadata with TransientDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDisplayDataMsg]
  }
  @scala.inline
  implicit class IUpdateDisplayDataMsgOps[Self <: IUpdateDisplayDataMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Metadata with TransientDisplayidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

