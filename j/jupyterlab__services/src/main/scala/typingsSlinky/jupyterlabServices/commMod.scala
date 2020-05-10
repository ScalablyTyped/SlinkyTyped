package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IComm
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernel
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IShellFuture
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorDisposable.mod.DisposableDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/comm", JSImport.Namespace)
@js.native
object commMod extends js.Object {
  @js.native
  class CommHandler protected ()
    extends DisposableDelegate
       with IComm {
    /**
      * Construct a new comm channel.
      */
    def this(target: String, id: String, kernel: IKernel, disposeCb: js.Function0[Unit]) = this()
    var _id: js.Any = js.native
    var _kernel: js.Any = js.native
    var _onClose: js.Any = js.native
    var _onMsg: js.Any = js.native
    var _target: js.Any = js.native
    def close(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    /**
      * Send a `comm_msg` message to the kernel.
      *
      * #### Notes
      * This is a no-op if the comm has been closed.
      *
      * **See also:** [[ICommMsg]]
      */
    def send(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  }
  
}

