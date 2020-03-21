package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonWait
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
trait IClearOutputMsg
  extends IIOPubMessage[clear_output]
     with _Message {
  @JSName("content")
  var content_IClearOutputMsg: AnonWait
}

object IClearOutputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonWait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearOutputMsg]
  }
}

