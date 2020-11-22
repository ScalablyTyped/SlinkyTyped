package typingsSlinky.jupyterlabApputils.sessioncontextMod

import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.session
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.KernelDisplayStatus
import typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typingsSlinky.jupyterlabServices.messagesMod.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.IOPubMessageType
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.Status
import typingsSlinky.jupyterlabServices.sessionSessionMod.ISessionConnection
import typingsSlinky.jupyterlabServices.sessionSessionMod.ISessionConnection.IKernelChangedArgs
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/sessioncontext", "SessionContext")
@js.native
class SessionContext_ protected () extends ISessionContext {
  /**
    * Construct a new session context.
    */
  def this(options: IOptions) = this()
  
  var _busyDisposable: js.Any = js.native
  
  /**
    * Change the kernel.
    */
  var _changeKernel: js.Any = js.native
  
  var _connectionStatusChanged: js.Any = js.native
  
  var _dialog: js.Any = js.native
  
  var _disposed: js.Any = js.native
  
  /**
    * Handle a new session object.
    */
  var _handleNewSession: js.Any = js.native
  
  /**
    * Handle an error in session startup.
    */
  var _handleSessionError: js.Any = js.native
  
  var _initPromise: js.Any = js.native
  
  var _initStarted: js.Any = js.native
  
  /**
    * Inner initialize function that doesn't handle promises.
    * This makes it easier to consolidate promise handling logic.
    */
  def _initialize(): js.Promise[Boolean] = js.native
  
  var _initializing: js.Any = js.native
  
  var _iopubMessage: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _isReady: js.Any = js.native
  
  var _isRestarting: js.Any = js.native
  
  var _isTerminating: js.Any = js.native
  
  var _kernelChanged: js.Any = js.native
  
  var _kernelPreference: js.Any = js.native
  
  var _name: js.Any = js.native
  
  /**
    * Handle a change to the session status.
    */
  var _onConnectionStatusChanged: js.Any = js.native
  
  /**
    * Handle an iopub message.
    */
  var _onIopubMessage: js.Any = js.native
  
  /**
    * Handle a change to the kernel.
    */
  var _onKernelChanged: js.Any = js.native
  
  /**
    * Handle a change to a session property.
    */
  var _onPropertyChanged: js.Any = js.native
  
  /**
    * Handle a session termination.
    */
  var _onSessionDisposed: js.Any = js.native
  
  /**
    * Handle a change to the session status.
    */
  var _onStatusChanged: js.Any = js.native
  
  /**
    * Handle an unhandled message.
    */
  var _onUnhandledMessage: js.Any = js.native
  
  var _path: js.Any = js.native
  
  var _pendingKernelName: js.Any = js.native
  
  var _pendingSessionRequest: js.Any = js.native
  
  var _prevKernelName: js.Any = js.native
  
  var _propertyChanged: js.Any = js.native
  
  var _ready: js.Any = js.native
  
  var _session: js.Any = js.native
  
  var _sessionChanged: js.Any = js.native
  
  var _setBusy: js.Any = js.native
  
  /**
    * Shut down the current session.
    */
  var _shutdownSession: js.Any = js.native
  
  /**
    * Start the session if necessary.
    *
    * @returns Whether to ask the user to pick a kernel.
    */
  var _startIfNecessary: js.Any = js.native
  
  var _statusChanged: js.Any = js.native
  
  var _type: js.Any = js.native
  
  var _unhandledMessage: js.Any = js.native
  
  /**
    * A signal emitted when the kernel status changes, proxied from the kernel.
    */
  @JSName("connectionStatusChanged")
  def connectionStatusChanged_MSessionContext_ : ISignal[this.type, ConnectionStatus] = js.native
  
  /**
    * A signal emitted when the poll is disposed.
    */
  @JSName("disposed")
  def disposed_MSessionContext_ : ISignal[this.type, Unit] = js.native
  
  /**
    * A signal emitted for iopub kernel messages, proxied from the kernel.
    */
  @JSName("iopubMessage")
  def iopubMessage_MSessionContext_ : ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
  
  /**
    * Test whether the context is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MSessionContext_ : Boolean = js.native
  
  /**
    * Whether the context is ready.
    */
  @JSName("isReady")
  def isReady_MSessionContext_ : Boolean = js.native
  
  /**
    * Whether the context is restarting.
    */
  @JSName("isRestarting")
  def isRestarting_MSessionContext_ : Boolean = js.native
  
  /**
    * Whether the context is terminating.
    */
  @JSName("isTerminating")
  def isTerminating_MSessionContext_ : Boolean = js.native
  
  /**
    * A signal emitted when the kernel connection changes, proxied from the session connection.
    */
  @JSName("kernelChanged")
  def kernelChanged_MSessionContext_ : ISignal[this.type, IKernelChangedArgs] = js.native
  
  /**
    * The display name of the current kernel, or a sensible alternative.
    *
    * #### Notes
    * This is a convenience function to have a consistent sensible name for the
    * kernel.
    */
  @JSName("kernelDisplayName")
  def kernelDisplayName_MSessionContext_ : String = js.native
  
  /**
    * A sensible status to display
    *
    * #### Notes
    * This combines the status and connection status into a single status for
    * the user.
    */
  @JSName("kernelDisplayStatus")
  def kernelDisplayStatus_MSessionContext_ : KernelDisplayStatus = js.native
  
  /**
    * The kernel preference of this client session.
    *
    * This is used when selecting a new kernel, and should reflect the sort of
    * kernel the activity prefers.
    */
  @JSName("kernelPreference")
  def kernelPreference_MSessionContext_ : IKernelPreference = js.native
  
  /**
    * The session name.
    *
    * #### Notes
    * Typically `.session.name` should be used. This attribute is useful if
    * there is no current session.
    */
  @JSName("name")
  def name_MSessionContext_ : String = js.native
  
  /**
    * The session path.
    *
    * #### Notes
    * Typically `.session.path` should be used. This attribute is useful if
    * there is no current session.
    */
  @JSName("path")
  def path_MSessionContext_ : String = js.native
  
  /**
    * The name of the previously started kernel.
    */
  @JSName("prevKernelName")
  def prevKernelName_MSessionContext_ : String = js.native
  
  /**
    * A signal emitted when a session property changes, proxied from the current session.
    */
  @JSName("propertyChanged")
  def propertyChanged_MSessionContext_ : ISignal[
    this.type, 
    typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.path | typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.name | typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`type`
  ] = js.native
  
  /**
    * A promise that is fulfilled when the context is ready.
    */
  @JSName("ready")
  def ready_MSessionContext_ : js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the session connection changes.
    */
  @JSName("sessionChanged")
  def sessionChanged_MSessionContext_ : ISignal[
    this.type, 
    IChangedArgs[ISessionConnection | Null, ISessionConnection | Null, session]
  ] = js.native
  
  /**
    * The current session connection.
    */
  @JSName("session")
  def session_MSessionContext_ : ISessionConnection | Null = js.native
  
  /**
    * A signal emitted when the kernel status changes, proxied from the kernel.
    */
  @JSName("statusChanged")
  def statusChanged_MSessionContext_ : ISignal[this.type, Status] = js.native
  
  /**
    * The session type.
    *
    * #### Notes
    * Typically `.session.type` should be used. This attribute is useful if
    * there is no current session.
    */
  @JSName("type")
  def type_MSessionContext_ : String = js.native
  
  /**
    * A signal emitted for an unhandled kernel message, proxied from the kernel.
    */
  @JSName("unhandledMessage")
  def unhandledMessage_MSessionContext_ : ISignal[this.type, IMessage[MessageType]] = js.native
}
