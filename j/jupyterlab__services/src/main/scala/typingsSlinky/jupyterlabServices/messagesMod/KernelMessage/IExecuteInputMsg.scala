package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Executioncount
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_input'` message on the `'iopub'` channel.
  *
  * See [Code inputs](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-inputs).
  */
@js.native
trait IExecuteInputMsg
  extends IIOPubMessage[execute_input]
     with Message {
  @JSName("content")
  var content_IExecuteInputMsg: Executioncount = js.native
}

object IExecuteInputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Executioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
  @scala.inline
  implicit class IExecuteInputMsgOps[Self <: IExecuteInputMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Executioncount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

