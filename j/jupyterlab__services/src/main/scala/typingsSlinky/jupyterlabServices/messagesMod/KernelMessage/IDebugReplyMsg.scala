package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonCommand
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_reply'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this is *NOT* considered
  * part of the public API, and may change without notice.
  */
trait IDebugReplyMsg
  extends IControlMessage[debug_reply]
     with _Message {
  @JSName("content")
  var content_IDebugReplyMsg: AnonCommand
}

object IDebugReplyMsg {
  @scala.inline
  def apply(
    channel: control,
    content: AnonCommand,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugReplyMsg]
  }
}

