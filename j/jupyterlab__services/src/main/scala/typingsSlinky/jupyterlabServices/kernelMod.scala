package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.jupyterlabServices.kernelManagerMod.KernelManager.IOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IModel
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
import typingsSlinky.jupyterlabServices.messagesMod.IStatusMsg
import typingsSlinky.jupyterlabServices.messagesMod.IStreamMsg
import typingsSlinky.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelMod {
  
  object KernelAPI {
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.KERNEL_SERVICE_URL")
    @js.native
    val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.getKernelModel")
    @js.native
    def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.getKernelModel")
    @js.native
    def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.interruptKernel")
    @js.native
    def interruptKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.interruptKernel")
    @js.native
    def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.restartKernel")
    @js.native
    def restartKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.restartKernel")
    @js.native
    def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.shutdownKernel")
    @js.native
    def shutdownKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.shutdownKernel")
    @js.native
    def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.startNew")
    @js.native
    def startNew(): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.startNew")
    @js.native
    def startNew(options: js.UndefOr[scala.Nothing], settings: ISettings): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.startNew")
    @js.native
    def startNew(options: IKernelOptions): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.startNew")
    @js.native
    def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
  }
  
  @JSImport("@jupyterlab/services/lib/kernel", "KernelManager")
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelManager ()
    extends typingsSlinky.jupyterlabServices.kernelManagerMod.KernelManager {
    def this(options: IOptions) = this()
  }
  
  object KernelMessage {
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage[T /* <: IClearOutputMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: typingsSlinky.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isClearOutputMsg")
    @js.native
    def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isCommCloseMsg")
    @js.native
    def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isCommMsgMsg")
    @js.native
    def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isCommOpenMsg")
    @js.native
    def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isDebugEventMsg")
    @js.native
    def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isDebugReplyMsg")
    @js.native
    def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isDebugRequestMsg")
    @js.native
    def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isDisplayDataMsg")
    @js.native
    def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isErrorMsg")
    @js.native
    def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isExecuteInputMsg")
    @js.native
    def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isExecuteReplyMsg")
    @js.native
    def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isExecuteResultMsg")
    @js.native
    def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isInfoRequestMsg")
    @js.native
    def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isInputReplyMsg")
    @js.native
    def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isInputRequestMsg")
    @js.native
    def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isStatusMsg")
    @js.native
    def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isStreamMsg")
    @js.native
    def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage.isUpdateDisplayDataMsg")
    @js.native
    def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = js.native
  }
}
