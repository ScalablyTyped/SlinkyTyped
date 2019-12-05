package typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.input_reply
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.input_request
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.stdin
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'input_reply'` message on the `'stdin'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
  */
trait IInputReplyMsg
  extends IStdinMessage[input_reply]
     with _Message {
  @JSName("content")
  var content_IInputReplyMsg: ReplyContent[IInputReply]
  @JSName("parent_header")
  var parent_header_IInputReplyMsg: IHeader[input_request]
}

object IInputReplyMsg {
  @scala.inline
  def apply(
    channel: stdin,
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request],
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputReplyMsg]
  }
}

