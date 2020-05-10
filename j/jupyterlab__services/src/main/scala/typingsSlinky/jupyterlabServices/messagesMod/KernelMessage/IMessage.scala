package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonAllowstdin
import typingsSlinky.jupyterlabServices.AnonArguments
import typingsSlinky.jupyterlabServices.AnonBody
import typingsSlinky.jupyterlabServices.AnonCode
import typingsSlinky.jupyterlabServices.AnonCodeString
import typingsSlinky.jupyterlabServices.AnonCommid
import typingsSlinky.jupyterlabServices.AnonCursorpos
import typingsSlinky.jupyterlabServices.AnonData
import typingsSlinky.jupyterlabServices.AnonEname
import typingsSlinky.jupyterlabServices.AnonEvent
import typingsSlinky.jupyterlabServices.AnonExecutioncount
import typingsSlinky.jupyterlabServices.AnonExecutionstate
import typingsSlinky.jupyterlabServices.AnonMetadata
import typingsSlinky.jupyterlabServices.AnonName
import typingsSlinky.jupyterlabServices.AnonPassword
import typingsSlinky.jupyterlabServices.AnonTarget
import typingsSlinky.jupyterlabServices.AnonTransient
import typingsSlinky.jupyterlabServices.AnonTransientAnonDisplayidString
import typingsSlinky.jupyterlabServices.AnonWait
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kernel message specification.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
  */
@js.native
trait IMessage[MSGTYPE /* <: MessageType */] extends js.Object {
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.native
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel = js.native
  /**
    * The content of the message.
    */
  var content: AnonWait | AnonCommid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent = js.native
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE] = js.native
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject = js.native
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object = js.native
}

object IMessage {
  @scala.inline
  def apply[MSGTYPE](
    channel: Channel,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
  @scala.inline
  implicit class IMessageOps[Self[msgtype] <: IMessage[msgtype], MSGTYPE] (val x: Self[MSGTYPE]) extends AnyVal {
    @scala.inline
    def duplicate: Self[MSGTYPE] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[MSGTYPE]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[MSGTYPE] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[MSGTYPE] with Other]
    @scala.inline
    def withChannel(value: Channel): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(
      value: AnonWait | AnonCommid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent
    ): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: IHeader[MSGTYPE]): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: JSONObject): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_header(value: IHeader[MessageType] | js.Object): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffers: Self[MSGTYPE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(js.undefined)
        ret
    }
  }
  
}

