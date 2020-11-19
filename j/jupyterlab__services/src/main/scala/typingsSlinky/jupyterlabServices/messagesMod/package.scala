package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object messagesMod {
  
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = typingsSlinky.jupyterlabServices.messagesMod.IExecuteCount with typingsSlinky.jupyterlabServices.messagesMod.IReplyOkContent
  
  type IShellControlMessage = typingsSlinky.jupyterlabServices.messagesMod.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType] | typingsSlinky.jupyterlabServices.messagesMod.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.ControlMessageType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabServices.messagesMod.IClearOutputMsg
    - typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg[
  typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsSlinky.jupyterlabServices.messagesMod.ICommInfoReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.ICommInfoRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg[
  typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg[
  typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsSlinky.jupyterlabServices.messagesMod.ICompleteReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.ICompleteRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IDisplayDataMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IErrorMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IExecuteInputMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IExecuteRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IExecuteResultMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IHistoryReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInfoReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInfoRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInputReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInputRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInspectReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IInspectRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IStatusMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IStreamMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IDebugRequestMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IDebugReplyMsg
    - typingsSlinky.jupyterlabServices.messagesMod.IDebugEventMsg
  */
  type Message = typingsSlinky.jupyterlabServices.messagesMod._Message | (typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg[
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg[
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg[
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
    - typingsSlinky.jupyterlabServices.messagesMod.IReplyErrorContent
    - typingsSlinky.jupyterlabServices.messagesMod.IReplyAbortContent
  */
  type ReplyContent[T] = typingsSlinky.jupyterlabServices.messagesMod._ReplyContent[T] | T
}
