package typingsSlinky.atJupyterlabServices

import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel.IKernel
import typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel.IModel
import typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typingsSlinky.atJupyterlabServices.libKernelManagerMod.KernelManager.IOptions
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IClearOutputMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommCloseMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommInfoReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommInfoRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommMsgMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommOpenMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICompleteReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICompleteRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugEventMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDisplayDataMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IErrorMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteInputMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteResultMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IHistoryReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IHistoryRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInfoReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInfoRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInputReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInputRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInspectReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInspectRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIsCompleteReplyMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIsCompleteRequestMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IStatusMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IStreamMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IUpdateDisplayDataMsg
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import typingsSlinky.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel", JSImport.Namespace)
@js.native
object libKernelMod extends js.Object {
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelManager ()
    extends typingsSlinky.atJupyterlabServices.libKernelManagerMod.KernelManager {
    def this(options: IOptions) = this()
  }
  
  @js.native
  object Kernel extends js.Object {
    /**
      * Connect to a running kernel.
      *
      * @param model - The model of the running kernel.
      *
      * @param settings - The server settings for the request.
      *
      * @returns The kernel object.
      *
      * #### Notes
      * If the kernel was already started via `startNewKernel`, the existing
      * Kernel object info is used to create another instance.
      */
    def connectTo(model: IModel): IKernel = js.native
    def connectTo(model: IModel, settings: ISettings): IKernel = js.native
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the kernel of interest.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the model for the kernel.
      *
      * #### Notes
      * If the kernel was already started via `startNewKernel`, we return its
      * `Kernel.IModel`. Otherwise, we attempt to find the existing kernel. The
      * promise is fulfilled when the kernel is found, otherwise the promise is
      * rejected.
      */
    def findById(id: String): js.Promise[IModel] = js.native
    def findById(id: String, settings: ISettings): js.Promise[IModel] = js.native
    /**
      * Fetch all of the kernel specs.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the kernel specs.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
      */
    def getSpecs(): js.Promise[ISpecModels] = js.native
    def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
    /**
      * Fetch the running kernels.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the list of running kernels.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    /**
      * Shut down a kernel by id.
      *
      * @param id - The id of the running kernel.
      *
      * @param settings - The server settings for the request.
      *
      * @returns A promise that resolves when the kernel is shut down.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    def shutdown(id: String, settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Shut down all kernels.
      *
      * @returns A promise that resolves when all of the kernels are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Start a new kernel.
      *
      * @param options - The options used to create the kernel.
      *
      * @returns A promise that resolves with a kernel object.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * If no options are given or the kernel name is not given, the
      * default kernel will by started by the server.
      *
      * Wraps the result in a Kernel object. The promise is fulfilled
      * when the kernel is started by the server, otherwise the promise is rejected.
      */
    def startNew(): js.Promise[IKernel] = js.native
    def startNew(options: typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel.IOptions): js.Promise[IKernel] = js.native
  }
  
  @js.native
  object KernelMessage extends js.Object {
    def createMessage[T /* <: ICommInfoReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    /**
      * @hidden
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this function is *NOT* considered
      * part of the public API, and may change without notice.
      */
    @JSName("createMessage")
    def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    /**
      * @hidden
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this function is *NOT* considered
      * part of the public API, and may change without notice.
      */
    @JSName("createMessage")
    def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    /**
      * @hidden
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this function is *NOT* considered
      * part of the public API, and may change without notice.
      */
    @JSName("createMessage")
    def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOptions[T]): T = js.native
    /**
      * Test whether a kernel message is a `'clear_output'` message.
      */
    def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IClearOutputMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'comm_close'` message.
      */
    def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'comm_msg'` message.
      */
    def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'comm_open'` message.
      */
    def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
    /**
      * Test whether a kernel message is an experimental `'debug_event'` message.
      *
      * @hidden
      *
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this is *NOT* considered
      * part of the public API, and may change without notice.
      */
    def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugEventMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an experimental `'debug_reply'` message.
      *
      * @hidden
      *
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this is *NOT* considered
      * part of the public API, and may change without notice.
      */
    def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugReplyMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an experimental `'debug_request'` message.
      *
      * @hidden
      *
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this is *NOT* considered
      * part of the public API, and may change without notice.
      */
    def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugRequestMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'display_data'` message.
      */
    def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'error'` message.
      */
    def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IErrorMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'execute_input'` message.
      */
    def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteInputMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'execute_reply'` message.
      */
    def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteReplyMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'execute_result'` message.
      */
    def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteResultMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'kernel_info_request'` message.
      */
    def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInfoRequestMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'input_reply'` message.
      */
    def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputReplyMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'input_request'` message.
      */
    def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputRequestMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'status'` message.
      */
    def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStatusMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is a `'stream'` message.
      */
    def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStreamMsg */ Boolean = js.native
    /**
      * Test whether a kernel message is an `'update_display_data'` message.
      */
    def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IUpdateDisplayDataMsg */ Boolean = js.native
  }
  
}

