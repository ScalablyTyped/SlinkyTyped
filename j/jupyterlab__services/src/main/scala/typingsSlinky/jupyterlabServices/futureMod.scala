package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.kernelKernelMod.IFuture
import typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection
import typingsSlinky.jupyterlabServices.messagesMod.ControlMessageType
import typingsSlinky.jupyterlabServices.messagesMod.IControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.IOPubMessageType
import typingsSlinky.jupyterlabServices.messagesMod.IShellControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.IStdinMessage
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType
import typingsSlinky.jupyterlabServices.messagesMod.StdinMessageType
import typingsSlinky.luminoDisposable.mod.DisposableDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernel/future", JSImport.Namespace)
@js.native
object futureMod extends js.Object {
  
  @js.native
  class KernelControlFutureHandler[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] () extends KernelFutureHandler[REQUEST, REPLY]
  
  @js.native
  abstract class KernelFutureHandler[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] protected ()
    extends DisposableDelegate
       with IFuture[REQUEST, REPLY] {
    /**
      * Construct a new KernelFutureHandler.
      */
    def this(
      cb: js.Function0[Unit],
      msg: REQUEST,
      expectReply: Boolean,
      disposeOnDone: Boolean,
      kernel: IKernelConnection
    ) = this()
    
    var _disposeOnDone: js.Any = js.native
    
    var _done: js.Any = js.native
    
    var _handleDone: js.Any = js.native
    
    var _handleIOPub: js.Any = js.native
    
    var _handleReply: js.Any = js.native
    
    var _handleStdin: js.Any = js.native
    
    var _hooks: js.Any = js.native
    
    var _iopub: js.Any = js.native
    
    var _kernel: js.Any = js.native
    
    var _msg: js.Any = js.native
    
    var _reply: js.Any = js.native
    
    var _replyMsg: js.Any = js.native
    
    /**
      * Set the given future flag.
      */
    var _setFlag: js.Any = js.native
    
    var _status: js.Any = js.native
    
    var _stdin: js.Any = js.native
    
    /**
      * Test whether the given future flag is set.
      */
    var _testFlag: js.Any = js.native
    
    /**
      * A promise that resolves when the future is done.
      */
    @JSName("done")
    def done_MKernelFutureHandler: js.Promise[REPLY] = js.native
    
    /**
      * Handle an incoming kernel message.
      */
    def handleMsg(msg: IMessage[MessageType]): js.Promise[Unit] = js.native
    
    /**
      * Get the original outgoing message.
      */
    @JSName("msg")
    def msg_MKernelFutureHandler: REQUEST = js.native
    
    /**
      * Get the iopub handler.
      */
    def onIOPub: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the iopub handler.
      */
    def onIOPub_=(cb: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | js.Thenable[Unit]]): Unit = js.native
    
    /**
      * Get the reply handler.
      */
    def onReply: js.Function1[/* msg */ REPLY, Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the reply handler.
      */
    def onReply_=(cb: js.Function1[/* msg */ REPLY, Unit | js.Thenable[Unit]]): Unit = js.native
    
    /**
      * Get the stdin handler.
      */
    def onStdin: js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the stdin handler.
      */
    def onStdin_=(cb: js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | js.Thenable[Unit]]): Unit = js.native
  }
  
  @js.native
  class KernelShellFutureHandler[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] () extends KernelFutureHandler[REQUEST, REPLY]
}
