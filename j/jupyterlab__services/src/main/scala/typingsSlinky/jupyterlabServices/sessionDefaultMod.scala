package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IAnyMessageArgs
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernel
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.Status
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IOptions
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/default", JSImport.Namespace)
@js.native
object sessionDefaultMod extends js.Object {
  @js.native
  class DefaultSession protected () extends ISession {
    /**
      * Construct a new session.
      */
    def this(options: IOptions, id: String, model: IModel) = this()
    var _anyMessage: js.Any = js.native
    /**
      * Handle a change to the model.
      */
    var _handleModelChange: js.Any = js.native
    var _id: js.Any = js.native
    var _iopubMessage: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _kernel: js.Any = js.native
    var _kernelChanged: js.Any = js.native
    var _name: js.Any = js.native
    /**
      * Send a PATCH to the server, updating the session path or the kernel.
      */
    var _patch: js.Any = js.native
    var _path: js.Any = js.native
    var _propertyChanged: js.Any = js.native
    var _statusChanged: js.Any = js.native
    var _terminated: js.Any = js.native
    var _type: js.Any = js.native
    var _unhandledMessage: js.Any = js.native
    var _updating: js.Any = js.native
    /**
      * Handle any kernel messages.
      */
    /* protected */ def onAnyMessage(sender: IKernel, args: IAnyMessageArgs): Unit = js.native
    /**
      * Handle iopub kernel messages.
      */
    /* protected */ def onIOPubMessage(sender: IKernel, msg: IIOPubMessage[IOPubMessageType]): Unit = js.native
    /**
      * Handle to changes in the Kernel status.
      */
    /* protected */ def onKernelStatus(sender: IKernel, state: Status): Unit = js.native
    /**
      * Handle unhandled kernel messages.
      */
    /* protected */ def onUnhandledMessage(sender: IKernel, msg: IMessage[MessageType]): Unit = js.native
    /**
      * Create a new kernel connection and hook up to its events.
      *
      * #### Notes
      * This method is not meant to be subclassed.
      */
    /* protected */ def setupKernel(model: IModel): Unit = js.native
    /**
      * Update the session based on a session model from the server.
      */
    def update(model: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel): Unit = js.native
  }
  
  @js.native
  object DefaultSession extends js.Object {
    /**
      * Connect to a running session.
      */
    def connectTo(model: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel): ISession = js.native
    def connectTo(model: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel, settings: ISettings): ISession = js.native
    /**
      * Find a session by id.
      */
    def findById(id: String): js.Promise[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    def findById(id: String, settings: ISettings): js.Promise[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    /**
      * Find a session by path.
      */
    def findByPath(path: String): js.Promise[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    def findByPath(path: String, settings: ISettings): js.Promise[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    /**
      * List the running sessions.
      */
    def listRunning(): js.Promise[js.Array[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel]] = js.native
    /**
      * Shut down a session by id.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    def shutdown(id: String, settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Shut down all sessions.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when all the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Start a new session.
      */
    def startNew(options: IOptions): js.Promise[ISession] = js.native
  }
  
}

