package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IFuture
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernel
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import typingsSlinky.phosphorDisposable.mod.DisposableDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
      kernel: IKernel
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
    val done_KernelFutureHandler: js.Promise[REPLY] = js.native
    /**
      * Handle an incoming kernel message.
      */
    def handleMsg(msg: IMessage[MessageType]): js.Promise[Unit] = js.native
  }
  
  @js.native
  class KernelShellFutureHandler[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] () extends KernelFutureHandler[REQUEST, REPLY]
  
}

