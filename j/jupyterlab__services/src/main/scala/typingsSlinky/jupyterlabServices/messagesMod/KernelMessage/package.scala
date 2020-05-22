package typingsSlinky.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KernelMessage {
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteCount with typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IReplyOkContent
  /**
    * A message type for shell or control messages.
    *
    * #### Notes
    * This convenience is so we can use it as a generic type constraint.
    */
  type IShellControlMessage = typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] | typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType]
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
  type Message = typingsSlinky.jupyterlabServices.messagesMod.KernelMessage._Message | (typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  ])
  /**
    * A convenience type for reply content.
    *
    * This automatically unions the necessary error and abort replies required in
    * the [message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply).
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IReplyErrorContent
    - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IReplyAbortContent
  */
  type ReplyContent[T] = typingsSlinky.jupyterlabServices.messagesMod.KernelMessage._ReplyContent[T] | T
}
