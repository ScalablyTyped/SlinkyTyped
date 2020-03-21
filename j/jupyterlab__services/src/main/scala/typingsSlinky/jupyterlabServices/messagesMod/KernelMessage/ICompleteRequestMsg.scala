package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonCode
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A  `'complete_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteReplyMsg]], [[IKernel.complete]]
  */
trait ICompleteRequestMsg
  extends IShellMessage[complete_request]
     with _Message {
  @JSName("content")
  var content_ICompleteRequestMsg: AnonCode
}

object ICompleteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: AnonCode,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
}

