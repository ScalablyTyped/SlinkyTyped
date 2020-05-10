package typingsSlinky.jupyterlabServices

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
@js.native
trait ReadonlyIMessageMessageTy extends js.Object {
  val buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.native
  val channel: Channel = js.native
  val content: AnonWait | AnonCommid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | (AnonMetadata with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent = js.native
  val header: IHeader[MessageType] = js.native
  val metadata: JSONObject = js.native
  val parent_header: IHeader[MessageType] | js.Object = js.native
}

object ReadonlyIMessageMessageTy {
  @scala.inline
  def apply(
    channel: Channel,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | (AnonMetadata with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
  @scala.inline
  implicit class ReadonlyIMessageMessageTyOps[Self <: ReadonlyIMessageMessageTy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(
      value: AnonWait | AnonCommid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | (AnonMetadata with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: IHeader[MessageType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[MessageType] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(js.undefined)
        ret
    }
  }
  
}

