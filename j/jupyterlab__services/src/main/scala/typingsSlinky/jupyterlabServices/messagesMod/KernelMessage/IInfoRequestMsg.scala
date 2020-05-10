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
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'kernel_info_request'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
@js.native
trait IInfoRequestMsg
  extends IShellMessage[kernel_info_request]
     with _Message

object IInfoRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoRequestMsg]
  }
}

