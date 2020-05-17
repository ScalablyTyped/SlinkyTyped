package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Allowstdin
import typingsSlinky.jupyterlabServices.anon.Arguments
import typingsSlinky.jupyterlabServices.anon.Body
import typingsSlinky.jupyterlabServices.anon.Code
import typingsSlinky.jupyterlabServices.anon.CodeString
import typingsSlinky.jupyterlabServices.anon.Commid
import typingsSlinky.jupyterlabServices.anon.Cursorpos
import typingsSlinky.jupyterlabServices.anon.Data
import typingsSlinky.jupyterlabServices.anon.Ename
import typingsSlinky.jupyterlabServices.anon.Event
import typingsSlinky.jupyterlabServices.anon.Executioncount
import typingsSlinky.jupyterlabServices.anon.Executionstate
import typingsSlinky.jupyterlabServices.anon.Metadata
import typingsSlinky.jupyterlabServices.anon.Name
import typingsSlinky.jupyterlabServices.anon.Password
import typingsSlinky.jupyterlabServices.anon.Target
import typingsSlinky.jupyterlabServices.anon.Transient
import typingsSlinky.jupyterlabServices.anon.TransientDisplayidString
import typingsSlinky.jupyterlabServices.anon.Wait
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
  var content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event = js.native
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
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
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
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event
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

