package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IClearOutputMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommInfoRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICompleteReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICompleteRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IDisplayDataMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IErrorMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteInputMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteResultMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInfoReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInfoRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInputReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInputRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInspectReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IInspectRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IStatusMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IStreamMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IUpdateDisplayDataMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IDebugRequestMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IDebugReplyMsg
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IDebugEventMsg
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: IClearOutputMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICommCloseMsg[iopub | shell]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICommInfoReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICommInfoRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICommMsgMsg[iopub | shell]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICommOpenMsg[iopub | shell]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICompleteReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: ICompleteRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IDebugEventMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IDebugReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IDebugRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IDisplayDataMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IErrorMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IExecuteInputMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IExecuteReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IExecuteRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IExecuteResultMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IHistoryReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IHistoryRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInfoReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInfoRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInputReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInputRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInspectReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IInspectRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IIsCompleteReplyMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IIsCompleteRequestMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IStatusMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IStreamMsg): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: IUpdateDisplayDataMsg): Message = value.asInstanceOf[Message]
}

