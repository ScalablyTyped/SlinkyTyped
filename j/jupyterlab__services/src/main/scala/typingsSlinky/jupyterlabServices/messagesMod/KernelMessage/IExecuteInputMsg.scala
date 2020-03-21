package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonExecutioncount
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
trait IExecuteInputMsg
  extends IIOPubMessage[execute_input]
     with _Message {
  @JSName("content")
  var content_IExecuteInputMsg: AnonExecutioncount
}

object IExecuteInputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonExecutioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
}

