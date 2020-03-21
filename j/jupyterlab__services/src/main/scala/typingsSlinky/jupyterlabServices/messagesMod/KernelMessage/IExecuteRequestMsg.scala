package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonAllowstdin
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `execute_request` message on the `'shell'` channel.
  */
trait IExecuteRequestMsg
  extends IShellMessage[execute_request]
     with _Message {
  @JSName("content")
  var content_IExecuteRequestMsg: AnonAllowstdin
}

object IExecuteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: AnonAllowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequestMsg]
  }
}

