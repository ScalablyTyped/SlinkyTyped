package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Wait
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'clear_output'` message on the `'iopub'` channel.
  *
  * See [Clear output](https://jupyter-client.readthedocs.io/en/latest/messaging.html#clear-output).
  */
@js.native
trait IClearOutputMsg
  extends IIOPubMessage[clear_output]
     with Message {
  @JSName("content")
  var content_IClearOutputMsg: Wait = js.native
}

object IClearOutputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearOutputMsg]
  }
  @scala.inline
  implicit class IClearOutputMsgOps[Self <: IClearOutputMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Wait): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

