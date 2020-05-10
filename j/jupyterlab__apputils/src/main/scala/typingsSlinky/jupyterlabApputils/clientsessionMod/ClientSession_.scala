package typingsSlinky.jupyterlabApputils.clientsessionMod

import typingsSlinky.jupyterlabApputils.clientsessionMod.ClientSession.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession")
@js.native
class ClientSession_ protected () extends IClientSession {
  /**
    * Construct a new client session.
    */
  def this(options: IOptions) = this()
  var _busyDisposable: js.Any = js.native
  /**
    * Change the kernel.
    */
  var _changeKernel: js.Any = js.native
  var _dialog: js.Any = js.native
  /**
    * Handle a new session object.
    */
  var _handleNewSession: js.Any = js.native
  /**
    * Handle an error in session startup.
    */
  var _handleSessionError: js.Any = js.native
  var _initializing: js.Any = js.native
  var _iopubMessage: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _kernelChanged: js.Any = js.native
  var _kernelPreference: js.Any = js.native
  var _name: js.Any = js.native
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
    * Handle a change to the session status.
    */
  var _onStatusChanged: js.Any = js.native
  /**
    * Handle a session termination.
    */
  var _onTerminated: js.Any = js.native
  /**
    * Handle an unhandled message.
    */
  var _onUnhandledMessage: js.Any = js.native
  var _path: js.Any = js.native
  var _prevKernelName: js.Any = js.native
  var _propertyChanged: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Select a kernel.
    *
    * @param cancelable: whether the dialog should have a cancel button.
    */
  var _selectKernel: js.Any = js.native
  var _session: js.Any = js.native
  var _setBusy: js.Any = js.native
  /**
    * Start the session if necessary.
    */
  var _startIfNecessary: js.Any = js.native
  /**
    * Start a session and set up its signals.
    */
  var _startSession: js.Any = js.native
  var _statusChanged: js.Any = js.native
  var _terminated: js.Any = js.native
  var _type: js.Any = js.native
  var _unhandledMessage: js.Any = js.native
  /**
    * A signal emitted for iopub kernel messages.
    */
  @JSName("iopubMessage")
  val iopubMessage_ClientSession_ : ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
  /**
    * The session manager used by the session.
    */
  val manager: IManager = js.native
  /**
    * Initialize the session.
    *
    * #### Notes
    * If a server session exists on the current path, we will connect to it.
    * If preferences include disabling `canStart` or `shouldStart`, no
    * server session will be started.
    * If a kernel id is given, we attempt to start a session with that id.
    * If a default kernel is available, we connect to it.
    * Otherwise we ask the user to select a kernel.
    */
  def initialize(): js.Promise[Unit] = js.native
}

