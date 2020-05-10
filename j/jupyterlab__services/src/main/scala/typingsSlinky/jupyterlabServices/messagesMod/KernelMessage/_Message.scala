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
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.display_data
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.status
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stream
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Message extends js.Object

object _Message {
  @scala.inline
  def IDisplayDataMsg(
    channel: iopub,
    content: AnonMetadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICompleteRequestMsg(
    channel: shell,
    content: AnonCode,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IStatusMsg(
    channel: iopub,
    content: AnonExecutionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICompleteReplyMsg(
    channel: shell,
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugEventMsg(
    channel: iopub,
    content: AnonEvent,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICommInfoReplyMsg(
    channel: shell,
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IStreamMsg(
    channel: iopub,
    content: AnonName,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInfoReplyMsg(
    channel: shell,
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInfoRequestMsg(
    channel: shell,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTarget | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IIsCompleteRequestMsg(
    channel: shell,
    content: AnonCodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteRequestMsg(
    channel: shell,
    content: AnonAllowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IHistoryRequestMsg(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IHistoryReplyMsg(
    channel: shell,
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICommInfoRequestMsg(
    channel: shell,
    content: AnonTarget,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugRequestMsg(
    channel: control,
    content: AnonArguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IClearOutputMsg(
    channel: iopub,
    content: AnonWait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IErrorMsg(
    channel: iopub,
    content: AnonEname,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IUpdateDisplayDataMsg(
    channel: iopub,
    content: AnonMetadata with AnonTransientAnonDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInspectRequestMsg(
    channel: shell,
    content: AnonCursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IIsCompleteReplyMsg(
    channel: shell,
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteResultMsg(
    channel: iopub,
    content: AnonTransient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInputRequestMsg(
    channel: stdin,
    content: AnonPassword,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInputReplyMsg(
    channel: stdin,
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInspectReplyMsg(
    channel: shell,
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugReplyMsg(
    channel: control,
    content: AnonBody,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteReplyMsg(
    channel: shell,
    content: ReplyContent[IExecuteReply] with IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request]
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteInputMsg(
    channel: iopub,
    content: AnonExecutioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
}

