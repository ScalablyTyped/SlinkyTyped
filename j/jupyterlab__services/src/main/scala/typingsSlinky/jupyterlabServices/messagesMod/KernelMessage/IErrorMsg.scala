package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Ename
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'error'` message on the `'iopub'` channel.
  *
  * See [Execution errors](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-errors).
  */
trait IErrorMsg
  extends IIOPubMessage[error]
     with _Message {
  @JSName("content")
  var content_IErrorMsg: Ename
}

object IErrorMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView] = null
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorMsg]
  }
}

