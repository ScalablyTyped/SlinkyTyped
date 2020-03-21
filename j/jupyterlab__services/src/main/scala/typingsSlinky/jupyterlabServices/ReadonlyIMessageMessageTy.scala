package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.Channel
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHeader
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.MessageType>> */
trait ReadonlyIMessageMessageTy extends js.Object {
  val buffers: js.UndefOr[
    js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ]
  ] = js.undefined
  val channel: Channel
  val content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any
  val header: IHeader[MessageType]
  val metadata: JSONObject
  val parent_header: IHeader[MessageType] | js.Object
}

object ReadonlyIMessageMessageTy {
  @scala.inline
  def apply(
    channel: Channel,
    content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
}

