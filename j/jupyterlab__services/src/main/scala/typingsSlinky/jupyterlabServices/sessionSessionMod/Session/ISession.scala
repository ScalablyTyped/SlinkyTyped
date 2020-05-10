package typingsSlinky.jupyterlabServices.sessionSessionMod.Session

import typingsSlinky.jupyterlabServices.PartialIModelId
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.`type`
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.name
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.path
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IAnyMessageArgs
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.Status
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a session object.
  */
@js.native
trait ISession extends IDisposable {
  /**
    * A signal emitted for any kernel message.
    *
    * Note: The behavior is undefined if the message is modified
    * during message handling. As such, it should be treated as read-only.
    */
  var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
  /**
    * Unique id of the session.
    */
  val id: String = js.native
  /**
    * A signal emitted for iopub kernel messages.
    */
  var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernelConnection = js.native
  /**
    * A signal emitted when the kernel changes.
    */
  var kernelChanged: ISignal[this.type, IKernelChangedArgs] = js.native
  /**
    * The model associated with the session.
    */
  val model: IModel = js.native
  /**
    * The current name associated with the session.
    */
  val name: String = js.native
  /**
    * The current path associated with the session.
    */
  val path: String = js.native
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: ISignal[
    this.type, 
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.path | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.name | typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.`type`
  ] = js.native
  /**
    * The server settings of the session.
    */
  val serverSettings: ISettings = js.native
  /**
    * The current status of the session.
    *
    * #### Notes
    * This is a delegate to the kernel status.
    */
  val status: Status = js.native
  /**
    * A signal emitted when the session status changes.
    */
  var statusChanged: ISignal[this.type, Status] = js.native
  /**
    * A signal emitted when the session is shut down.
    */
  var terminated: ISignal[this.type, Unit] = js.native
  /**
    * The type of the session.
    */
  val `type`: String = js.native
  /**
    * A signal emitted for unhandled kernel message.
    */
  var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Change the kernel.
    *
    * @param options - The name or id of the new kernel.
    *
    * @returns A promise that resolves with the new kernel model.
    *
    * #### Notes
    * This shuts down the existing kernel and creates a new kernel,
    * keeping the existing session ID and path.
    */
  def changeKernel(options: PartialIModelId): js.Promise[IKernelConnection] = js.native
  /**
    * Change the session name.
    */
  def setName(name: String): js.Promise[Unit] = js.native
  /**
    * Change the session path.
    *
    * @param path - The new session path.
    *
    * @returns A promise that resolves when the session has renamed.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def setPath(path: String): js.Promise[Unit] = js.native
  /**
    * Change the session type.
    */
  def setType(`type`: String): js.Promise[Unit] = js.native
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def shutdown(): js.Promise[Unit] = js.native
}

object ISession {
  @scala.inline
  def apply(
    anyMessage: ISignal[ISession, IAnyMessageArgs],
    changeKernel: PartialIModelId => js.Promise[IKernelConnection],
    dispose: () => Unit,
    id: String,
    iopubMessage: ISignal[ISession, IIOPubMessage[IOPubMessageType]],
    isDisposed: Boolean,
    kernel: IKernelConnection,
    kernelChanged: ISignal[ISession, IKernelChangedArgs],
    model: IModel,
    name: String,
    path: String,
    propertyChanged: ISignal[ISession, path | name | `type`],
    serverSettings: ISettings,
    setName: String => js.Promise[Unit],
    setPath: String => js.Promise[Unit],
    setType: String => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    status: Status,
    statusChanged: ISignal[ISession, Status],
    terminated: ISignal[ISession, Unit],
    `type`: String,
    unhandledMessage: ISignal[ISession, IMessage[MessageType]]
  ): ISession = {
    val __obj = js.Dynamic.literal(anyMessage = anyMessage.asInstanceOf[js.Any], changeKernel = js.Any.fromFunction1(changeKernel), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), status = status.asInstanceOf[js.Any], statusChanged = statusChanged.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyMessage(value: ISignal[ISession, IAnyMessageArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeKernel(value: PartialIModelId => js.Promise[IKernelConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIopubMessage(value: ISignal[ISession, IIOPubMessage[IOPubMessageType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iopubMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernel(value: IKernelConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelChanged(value: ISignal[ISession, IKernelChangedArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyChanged(value: ISignal[ISession, path | name | `type`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetName(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPath(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetType(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShutdown(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusChanged(value: ISignal[ISession, Status]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminated(value: ISignal[ISession, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandledMessage(value: ISignal[ISession, IMessage[MessageType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

