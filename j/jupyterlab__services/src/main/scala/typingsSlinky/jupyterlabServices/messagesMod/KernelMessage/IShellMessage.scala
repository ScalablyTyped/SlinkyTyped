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
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel message on the `'shell'` channel.
  */
@js.native
trait IShellMessage[T /* <: ShellMessageType */] extends IMessage[T] {
  @JSName("channel")
  var channel_IShellMessage: shell = js.native
}

object IShellMessage {
  @scala.inline
  def apply[T](
    channel: shell,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IShellMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellMessage[T]]
  }
  @scala.inline
  implicit class IShellMessageOps[Self[t] <: IShellMessage[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChannel(value: shell): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

