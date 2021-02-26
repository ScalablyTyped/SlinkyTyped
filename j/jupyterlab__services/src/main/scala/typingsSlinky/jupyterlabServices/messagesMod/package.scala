package typingsSlinky.jupyterlabServices

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def createMessage[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IClearOutputMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommCloseMsgiopub[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommCloseMsgshell[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommInfoReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommInfoReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommInfoRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommInfoRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommMsgMsgiopub[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommMsgMsgshell[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommOpenMsgiopub[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommOpenMsgshell[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICompleteReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICompleteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICompleteRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.ICompleteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugEventMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IDebugEventMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IDebugReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IDebugRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDisplayDataMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IDisplayDataMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IErrorMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IErrorMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteInputMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IExecuteInputMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IExecuteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteResultMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IExecuteResultMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IHistoryReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IHistoryReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IHistoryRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInfoReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInfoReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInfoRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInfoRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInputReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInputReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInputRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInputRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInspectReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInspectReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInspectRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IInspectRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IIsCompleteReplyMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IIsCompleteRequestMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IStatusMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IStatusMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IStreamMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IStreamMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IUpdateDisplayDataMsg[T /* <: typingsSlinky.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isClearOutputMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isClearOutputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ scala.Boolean]
  
  @scala.inline
  def isCommCloseMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommCloseMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isCommMsgMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommMsgMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isCommOpenMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommOpenMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isDebugEventMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugEventMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ scala.Boolean]
  
  @scala.inline
  def isDebugReplyMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isDebugRequestMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isDisplayDataMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ scala.Boolean]
  
  @scala.inline
  def isErrorMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isErrorMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteInputMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteInputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteReplyMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteResultMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResultMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ scala.Boolean]
  
  @scala.inline
  def isInfoRequestMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInfoRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isInputReplyMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInputReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isInputRequestMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInputRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isStatusMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatusMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ scala.Boolean]
  
  @scala.inline
  def isStreamMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStreamMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ scala.Boolean]
  
  @scala.inline
  def isUpdateDisplayDataMsg(
    msg: typingsSlinky.jupyterlabServices.messagesMod.IMessage[typingsSlinky.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ scala.Boolean = typingsSlinky.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ scala.Boolean]
}
