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
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel message on the `'stdin'` channel.
  */
@js.native
trait IStdinMessage[T /* <: StdinMessageType */] extends IMessage[T] {
  @JSName("channel")
  var channel_IStdinMessage: stdin = js.native
}

object IStdinMessage {
  @scala.inline
  def apply[T](
    channel: stdin,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Target | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStdinMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStdinMessage[T]]
  }
  @scala.inline
  implicit class IStdinMessageOps[Self[t] <: IStdinMessage[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChannel(value: stdin): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

