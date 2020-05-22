package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.Channel
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICompleteReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteCount
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHeader
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestRange
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestSearch
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestTail
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInfoReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInputReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInspectReply
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyIncomplete
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyOther
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ReplyContent
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.MessageType>> */
trait ReadonlyIMessageMessageTy extends js.Object {
  val buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.undefined
  val channel: Channel
  val content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event
  val header: IHeader[MessageType]
  val metadata: JSONObject
  val parent_header: IHeader[MessageType] | js.Object
}

object ReadonlyIMessageMessageTy {
  @scala.inline
  def apply(
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView] = null
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
}

