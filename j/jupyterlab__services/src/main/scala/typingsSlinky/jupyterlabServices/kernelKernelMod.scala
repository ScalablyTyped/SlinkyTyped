package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.anon.Allowstdin
import typingsSlinky.jupyterlabServices.anon.Arguments
import typingsSlinky.jupyterlabServices.anon.Code
import typingsSlinky.jupyterlabServices.anon.CodeString
import typingsSlinky.jupyterlabServices.anon.Cursorpos
import typingsSlinky.jupyterlabServices.anon.OmitIOptionsmodelserverSe
import typingsSlinky.jupyterlabServices.anon.PickIOptionsclientIdusern
import typingsSlinky.jupyterlabServices.anon.ReadonlyIMessageMessageTy
import typingsSlinky.jupyterlabServices.anon.Targetname
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.recv
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.send
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IModel
import typingsSlinky.jupyterlabServices.messagesMod.ControlMessageType
import typingsSlinky.jupyterlabServices.messagesMod.ICommCloseMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommInfoReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommMsgMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICommOpenMsg
import typingsSlinky.jupyterlabServices.messagesMod.ICompleteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.IDebugReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IDebugRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestRange
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestSearch
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestTail
import typingsSlinky.jupyterlabServices.messagesMod.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.IInfoReply
import typingsSlinky.jupyterlabServices.messagesMod.IInfoReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInputReply
import typingsSlinky.jupyterlabServices.messagesMod.IInspectReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.IOPubMessageType
import typingsSlinky.jupyterlabServices.messagesMod.IShellControlMessage
import typingsSlinky.jupyterlabServices.messagesMod.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.IStdinMessage
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.ReplyContent
import typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType
import typingsSlinky.jupyterlabServices.messagesMod.Status
import typingsSlinky.jupyterlabServices.messagesMod.StdinMessageType
import typingsSlinky.jupyterlabServices.restapiMod.ISpecModel
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import typingsSlinky.luminoCoreutils.jsonMod.JSONValue
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelKernelMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected
  */
  trait ConnectionStatus extends StObject
  object ConnectionStatus {
    
    @scala.inline
    def connected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected = "connected".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected]
    
    @scala.inline
    def connecting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting = "connecting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting]
    
    @scala.inline
    def disconnected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected]
  }
  
  @js.native
  trait IAnyMessageArgs extends StObject {
    
    /**
      * The direction of the message.
      */
    var direction: send | recv = js.native
    
    /**
      * The message that is being signaled.
      */
    var msg: ReadonlyIMessageMessageTy = js.native
  }
  object IAnyMessageArgs {
    
    @scala.inline
    def apply(direction: send | recv, msg: ReadonlyIMessageMessageTy): IAnyMessageArgs = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnyMessageArgs]
    }
    
    @scala.inline
    implicit class IAnyMessageArgsMutableBuilder[Self <: IAnyMessageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: send | recv): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: ReadonlyIMessageMessageTy): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IComm extends IDisposable {
    
    /**
      * Close the comm.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This will send a `comm_close` message to the kernel, and call the
      * `onClose` callback if set.
      *
      * This is a no-op if the comm is already closed.
      */
    def close(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(
      data: js.UndefOr[JSONValue],
      metadata: js.UndefOr[scala.Nothing],
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: js.UndefOr[JSONValue], metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(
      data: js.UndefOr[JSONValue],
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The unique id for the comm channel.
      */
    val commId: String = js.native
    
    /**
      * Callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client.
      * If this is called in response to a kernel message and the handler returns
      * a promise, all kernel message processing pauses until the promise is
      * resolved.
      */
    def onClose(msg: ICommCloseMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
    
    /**
      * Callback for a comm message received event.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onMsg(msg: ICommMsgMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
    
    /**
      * Open a comm with optional data and metadata.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This sends a `comm_open` message to the server.
      */
    def open(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(
      data: js.UndefOr[JSONValue],
      metadata: js.UndefOr[scala.Nothing],
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: js.UndefOr[JSONValue], metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(
      data: js.UndefOr[JSONValue],
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * Send a `comm_msg` message to the kernel.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @param buffers - Optional buffer data.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This is a no-op if the comm has been closed.
      */
    def send(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: js.UndefOr[scala.Nothing],
      buffers: js.UndefOr[scala.Nothing],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: js.UndefOr[scala.Nothing],
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: js.UndefOr[scala.Nothing],
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONValue, metadata: JSONObject, buffers: js.UndefOr[scala.Nothing], disposeOnDone: Boolean): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The target name for the comm channel.
      */
    val targetName: String = js.native
  }
  
  type IControlFuture[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] = IFuture[REQUEST, REPLY]
  
  @js.native
  trait IFuture[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] extends IDisposable {
    
    /**
      * A promise that resolves when the future is done.
      *
      * #### Notes
      * The future is done when there are no more responses expected from the
      * kernel.
      *
      * The `done` promise resolves to the reply message.
      */
    val done: js.Promise[REPLY] = js.native
    
    /**
      * The original outgoing message.
      */
    val msg: REQUEST = js.native
    
    /**
      * The iopub handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit] = js.native
    
    /**
      * The reply handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved. If there is a reply message, the future
      * `done` promise also resolves to the reply message after this handler has
      * been called.
      */
    def onReply(msg: REPLY): Unit | js.Thenable[Unit] = js.native
    
    /**
      * The stdin handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit] = js.native
    
    /**
      * Register hook for IOPub messages.
      *
      * @param hook - The callback invoked for an IOPub message.
      *
      * #### Notes
      * The IOPub hook system allows you to preempt the handlers for IOPub
      * messages handled by the future.
      *
      * The most recently registered hook is run first. A hook can return a
      * boolean or a promise to a boolean, in which case all kernel message
      * processing pauses until the promise is fulfilled. If a hook return value
      * resolves to false, any later hooks will not run and the function will
      * return a promise resolving to false. If a hook throws an error, the error
      * is logged to the console and the next hook is run. If a hook is
      * registered during the hook processing, it will not run until the next
      * message. If a hook is removed during the hook processing, it will be
      * deactivated immediately.
      */
    def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
    
    /**
      * Remove a hook for IOPub messages.
      *
      * @param hook - The hook to remove.
      *
      * #### Notes
      * If a hook is removed during the hook processing, it will be deactivated immediately.
      */
    def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
    
    /**
      * Send an `input_reply` message.
      */
    def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
  }
  object IFuture {
    
    @scala.inline
    def apply[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */](
      dispose: () => Unit,
      done: js.Promise[REPLY],
      isDisposed: Boolean,
      msg: REQUEST,
      onIOPub: IIOPubMessage[IOPubMessageType] => Unit | js.Thenable[Unit],
      onReply: REPLY => Unit | js.Thenable[Unit],
      onStdin: IStdinMessage[StdinMessageType] => Unit | js.Thenable[Unit],
      registerMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit,
      removeMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit,
      sendInputReply: ReplyContent[IInputReply] => Unit
    ): IFuture[REQUEST, REPLY] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), done = done.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], onIOPub = js.Any.fromFunction1(onIOPub), onReply = js.Any.fromFunction1(onReply), onStdin = js.Any.fromFunction1(onStdin), registerMessageHook = js.Any.fromFunction1(registerMessageHook), removeMessageHook = js.Any.fromFunction1(removeMessageHook), sendInputReply = js.Any.fromFunction1(sendInputReply))
      __obj.asInstanceOf[IFuture[REQUEST, REPLY]]
    }
    
    @scala.inline
    implicit class IFutureMutableBuilder[Self <: IFuture[_, _], REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] (val x: Self with (IFuture[REQUEST, REPLY])) extends AnyVal {
      
      @scala.inline
      def setDone(value: js.Promise[REPLY]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: REQUEST): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIOPub(value: IIOPubMessage[IOPubMessageType] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "onIOPub", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReply(value: REPLY => Unit | js.Thenable[Unit]): Self = StObject.set(x, "onReply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStdin(value: IStdinMessage[StdinMessageType] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "onStdin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterMessageHook(
        value: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit
      ): Self = StObject.set(x, "registerMessageHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveMessageHook(
        value: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit
      ): Self = StObject.set(x, "removeMessageHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendInputReply(value: ReplyContent[IInputReply] => Unit): Self = StObject.set(x, "sendInputReply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IKernelConnection extends IObservableDisposable {
    
    /**
      * A signal emitted when any kernel message is sent or received.
      *
      * #### Notes
      * This signal is emitted before any message handling has happened. The
      * message should be treated as read-only.
      */
    var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
    
    /**
      * The client unique id.
      *
      * #### Notes
      * This should be unique for a particular kernel connection object.
      */
    val clientId: String = js.native
    
    def clone(options: PickIOptionsclientIdusern): IKernelConnection = js.native
    
    /**
      * The current connection status of the kernel.
      */
    val connectionStatus: ConnectionStatus = js.native
    
    /**
      * A signal emitted when the kernel connection status changes.
      */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
    
    /**
      * Create a new comm.
      *
      * @param targetName - The name of the comm target.
      *
      * @param id - The comm id.
      *
      * @returns A comm instance.
      */
    def createComm(targetName: String): IComm = js.native
    def createComm(targetName: String, commId: String): IComm = js.native
    
    /**
      * Whether the kernel connection handles comm messages.
      *
      * #### Notes
      * The comm message protocol currently has implicit assumptions that only
      * one kernel connection is handling comm messages. This option allows a
      * kernel connection to opt out of handling comms.
      *
      * See https://github.com/jupyter/jupyter_client/issues/263
      */
    var handleComms: Boolean = js.native
    
    /**
      * Check if a comm exists.
      */
    def hasComm(commId: String): Boolean = js.native
    
    /**
      * The id of the server-side kernel.
      */
    val id: String = js.native
    
    /**
      * The kernel info
      *
      * #### Notes
      * This promise only resolves at startup, and is not refreshed on every
      * restart.
      */
    val info: js.Promise[IInfoReply] = js.native
    
    /**
      * Interrupt a kernel.
      *
      * @returns A promise that resolves when the kernel has interrupted.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
      *
      * The promise is fulfilled on a valid response and rejected otherwise.
      *
      * It is assumed that the API call does not mutate the kernel id or name.
      *
      * The promise will be rejected if the kernel status is `'dead'` or if the
      * request fails or the response is invalid.
      */
    def interrupt(): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted after an iopub kernel message is handled.
      */
    var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    
    /**
      * The kernel model, for convenience.
      */
    val model: IModel = js.native
    
    /**
      * The name of the server-side kernel.
      */
    val name: String = js.native
    
    /**
      * Reconnect to a disconnected kernel.
      *
      * @returns A promise that resolves when the kernel has reconnected.
      *
      * #### Notes
      * This just refreshes the connection to an existing kernel, and does not
      * perform an HTTP request to the server or restart the kernel.
      */
    def reconnect(): js.Promise[Unit] = js.native
    
    /**
      * Register a comm target handler.
      *
      * @param targetName - The name of the comm target.
      *
      * @param callback - The callback invoked for a comm open message.
      *
      * #### Notes
      * Only one comm target can be registered to a target name at a time, an
      * existing callback for the same target name will be overridden.  A registered
      * comm target handler will take precedence over a comm which specifies a
      * `target_module`.
      *
      * If the callback returns a promise, kernel message processing will pause
      * until the returned promise is fulfilled.
      */
    def registerCommTarget(
      targetName: String,
      callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
    ): Unit = js.native
    
    /**
      * Register an IOPub message hook.
      *
      * @param msg_id - The parent_header message id in messages the hook should
      * intercept.
      *
      * @param hook - The callback invoked for the message.
      *
      * #### Notes
      * The IOPub hook system allows you to preempt the handlers for IOPub
      * messages with a given parent_header message id. The most recently
      * registered hook is run first. If a hook return value resolves to false,
      * any later hooks and the future's onIOPub handler will not run. If a hook
      * throws an error, the error is logged to the console and the next hook is
      * run. If a hook is registered during the hook processing, it will not run
      * until the next message. If a hook is disposed during the hook processing,
      * it will be deactivated immediately.
      *
      * See also [[IFuture.registerMessageHook]].
      */
    def registerMessageHook(
      msgId: String,
      hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
    ): Unit = js.native
    
    /**
      * Remove a comm target handler.
      *
      * @param targetName - The name of the comm target to remove.
      *
      * @param callback - The callback to remove.
      *
      * #### Notes
      * The comm target is only removed if it matches the callback argument.
      */
    def removeCommTarget(
      targetName: String,
      callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
    ): Unit = js.native
    
    /**
      * Remove an IOPub message hook.
      *
      * @param msg_id - The parent_header message id the hook intercepted.
      *
      * @param hook - The callback invoked for the message.
      *
      */
    def removeMessageHook(
      msgId: String,
      hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
    ): Unit = js.native
    
    /**
      * Send a `comm_info_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm_info).
      *
      * Fulfills with the `comm_info_reply` content when the shell reply is
      * received and validated.
      */
    def requestCommInfo(content: Targetname): js.Promise[ICommInfoReplyMsg] = js.native
    
    /**
      * Send a `complete_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
      *
      * Fulfills with the `complete_reply` content when the shell reply is
      * received and validated.
      */
    def requestComplete(content: Code): js.Promise[ICompleteReplyMsg] = js.native
    
    /**
      * Send an experimental `debug_request` message.
      *
      * @hidden
      *
      * @param content - The content of the request.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A kernel future.
      *
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this function is *NOT* considered
      * part of the public API, and may change without notice.
      */
    def requestDebug(content: Arguments): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
    def requestDebug(content: Arguments, disposeOnDone: Boolean): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
    
    /**
      * Send an `execute_request` message.
      *
      * @param content - The content of the request.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A kernel future.
      *
      * #### Notes
      * See [Messaging in
      * Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
      *
      * This method returns a kernel future, rather than a promise, since execution may
      * have many response messages (for example, many iopub display messages).
      *
      * Future `onReply` is called with the `execute_reply` content when the
      * shell reply is received and validated.
      *
      * **See also:** [[IExecuteReply]]
      */
    def requestExecute(content: Allowstdin): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def requestExecute(content: Allowstdin, disposeOnDone: js.UndefOr[scala.Nothing], metadata: JSONObject): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def requestExecute(content: Allowstdin, disposeOnDone: Boolean): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def requestExecute(content: Allowstdin, disposeOnDone: Boolean, metadata: JSONObject): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    
    /**
      * Send a `history_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
      *
      * Fulfills with the `history_reply` content when the shell reply is
      * received and validated.
      */
    def requestHistory(content: IHistoryRequestRange): js.Promise[IHistoryReplyMsg] = js.native
    def requestHistory(content: IHistoryRequestSearch): js.Promise[IHistoryReplyMsg] = js.native
    def requestHistory(content: IHistoryRequestTail): js.Promise[IHistoryReplyMsg] = js.native
    
    /**
      * Send an `inspect_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
      *
      * Fulfills with the `inspect_reply` content when the shell reply is
      * received and validated.
      */
    def requestInspect(content: Cursorpos): js.Promise[IInspectReplyMsg] = js.native
    
    /**
      * Send an `is_complete_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
      *
      * Fulfills with the `is_complete_response` content when the shell reply is
      * received and validated.
      */
    def requestIsComplete(content: CodeString): js.Promise[IIsCompleteReplyMsg] = js.native
    
    /**
      * Send a `kernel_info_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
      *
      * Fulfills with the `kernel_info_response` content when the shell reply is
      * received and validated.
      */
    def requestKernelInfo(): js.Promise[js.UndefOr[IInfoReplyMsg]] = js.native
    
    /**
      * Restart a kernel.
      *
      * @returns A promise that resolves when the kernel has restarted.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * Any existing Future or Comm objects are cleared.
      *
      * It is assumed that the API call does not mutate the kernel id or name.
      *
      * The promise will be rejected if the kernel status is `'dead'` or if the
      * request fails or the response is invalid.
      */
    def restart(): js.Promise[Unit] = js.native
    
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T]): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: js.UndefOr[scala.Nothing], disposeOnDone: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    
    /**
      * Send an `input_reply` message.
      *
      * @param content - The content of the reply.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
      */
    def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
    
    /**
      * Send a shell message to the kernel.
      *
      * @param msg - The fully-formed shell message to send.
      *
      * @param expectReply - Whether to expect a shell reply message.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * #### Notes
      * Send a message to the kernel's shell channel, yielding a future object
      * for accepting replies.
      *
      * If `expectReply` is given and `true`, the future is done when both a
      * shell reply and an idle status message are received with the appropriate
      * parent header, in which case the `.done` promise resolves to the reply.
      * If `expectReply` is not given or is `false`, the future is done when an
      * idle status message with the appropriate parent header is received, in
      * which case the `.done` promise resolves to `undefined`.
      *
      * If `disposeOnDone` is given and `false`, the future will not be disposed
      * of when the future is done, instead relying on the caller to dispose of
      * it. This allows for the handling of out-of-order output from ill-behaved
      * kernels.
      *
      * All replies are validated as valid kernel messages.
      *
      * If the kernel status is `'dead'`, this will throw an error.
      */
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T]): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: js.UndefOr[scala.Nothing], disposeOnDone: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The server settings for the kernel.
      */
    val serverSettings: ISettings = js.native
    
    /**
      * Shutdown a kernel.
      *
      * @returns A promise that resolves when the kernel has shut down.
      *
      * #### Notes
      * Uses the [Jupyter Notebook
      * API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
      *
      * On a valid response, closes the websocket, disposes of the kernel
      * object, and fulfills the promise.
      *
      * The promise will be rejected if the kernel status is `'dead'`, the
      * request fails, or the response is invalid.
      */
    def shutdown(): js.Promise[Unit] = js.native
    
    /**
      * Get the kernel spec.
      *
      * @returns A promise that resolves with the kernel spec for this kernel.
      *
      * #### Notes
      * This may make a server request to retrieve the spec.
      */
    val spec: js.Promise[js.UndefOr[ISpecModel]] = js.native
    
    /**
      * The current status of the kernel.
      */
    val status: Status = js.native
    
    /**
      * A signal emitted when the kernel status changes.
      */
    var statusChanged: ISignal[this.type, Status] = js.native
    
    /**
      * A signal emitted for unhandled non-iopub kernel messages that claimed to
      * be responses for messages we sent using this kernel object.
      */
    var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
    
    /**
      * The client username.
      */
    val username: String = js.native
  }
  object IKernelConnection {
    
    /**
      * The options object used to initialize a kernel.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The unique identifier for the kernel client.
        */
      var clientId: js.UndefOr[String] = js.native
      
      /**
        * Whether the kernel connection should handle comm messages
        *
        * #### Notes
        * The comm message protocol currently has implicit assumptions that only
        * one kernel connection is handling comm messages. This option allows a
        * kernel connection to opt out of handling comms.
        *
        * See https://github.com/jupyter/jupyter_client/issues/263
        */
      var handleComms: js.UndefOr[Boolean] = js.native
      
      /**
        * The kernel model.
        */
      var model: IModel = js.native
      
      /**
        * The server settings for the kernel.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
      
      /**
        * The username of the kernel client.
        */
      var username: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: IModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
        
        @scala.inline
        def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
  }
  
  @js.native
  trait IManager
    extends typingsSlinky.jupyterlabServices.basemanagerMod.IManager {
    
    /**
      * Connect to an existing kernel.
      *
      * @param model - The model of the target kernel.
      *
      * @returns A promise that resolves with the new kernel instance.
      */
    def connectTo(options: IOptions): IKernelConnection = js.native
    
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves with the kernel's model, or undefined if not found.
      */
    def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Force a refresh of the running kernels.
      *
      * @returns A promise that resolves when the models are refreshed.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the known running kernels.
      *
      * @returns A new iterator over the running kernels.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running kernels change.
      */
    var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
    
    /**
      * Shut down a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all kernels.
      *
      * @returns A promise that resolves when all of the kernels are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Start a new kernel.
      *
      * @param createOptions - The kernel creation options
      *
      * @param connectOptions - The kernel connection options
      *
      * @returns A promise that resolves with the kernel connection.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: js.UndefOr[scala.Nothing], connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: IKernelOptions): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: IKernelOptions, connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
  }
  
  type IShellFuture[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] = IFuture[REQUEST, REPLY]
}
