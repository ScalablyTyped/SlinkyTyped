package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.jupyterlabServices.messagesMod.IClearOutputMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommInfoReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommInfoRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICompleteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICompleteRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IDebugEventMsg
import typingsSlinky.jupyterlabServices.messagesMod.IDebugReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IDebugRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IDisplayDataMsg
import typingsSlinky.jupyterlabServices.messagesMod.IErrorMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteInputMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteResultMsg
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInfoReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInfoRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInputReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInputRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInspectReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInspectRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.IStatusMsg
import typingsSlinky.jupyterlabServices.messagesMod.IStreamMsg
import typingsSlinky.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "KernelMessage")
@js.native
object KernelMessage extends js.Object {
  
  def createMessage[T /* <: IClearOutputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: IOptions[T]): T = js.native
  
  def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = js.native
  
  def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
  
  def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
  
  def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
  
  def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = js.native
  
  def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = js.native
  
  def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = js.native
  
  def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = js.native
  
  def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = js.native
  
  def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = js.native
  
  def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = js.native
  
  def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = js.native
  
  def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = js.native
  
  def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = js.native
  
  def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = js.native
  
  def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = js.native
  
  def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = js.native
  
  def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = js.native
}
