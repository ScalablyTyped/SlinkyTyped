package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonCommidData
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_msg
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_msg'` message on the `'iopub'` channel.
  *
  * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
  @JSName("channel")
  var channel_ICommMsgMsg: T
  @JSName("content")
  var content_ICommMsgMsg: AnonCommidData
}

object ICommMsgMsg {
  @scala.inline
  def apply[T /* <: iopub | shell */](
    channel: T,
    content: AnonCommidData,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
}

