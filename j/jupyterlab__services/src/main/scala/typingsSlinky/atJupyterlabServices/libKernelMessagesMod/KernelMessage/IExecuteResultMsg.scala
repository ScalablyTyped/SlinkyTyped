package typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typingsSlinky.atJupyterlabServices.Anon_DataExecutioncount
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_result'` message on the `'iopub'` channel.
  *
  * See [Execution results](https://jupyter-client.readthedocs.io/en/latest/messaging.html#id4).
  */
trait IExecuteResultMsg
  extends IIOPubMessage[execute_result]
     with _Message {
  @JSName("content")
  var content_IExecuteResultMsg: Anon_DataExecutioncount
}

object IExecuteResultMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_DataExecutioncount,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResultMsg]
  }
}

