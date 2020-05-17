package typingsSlinky.jupyterlabApputils.clientsessionMod

import typingsSlinky.jupyterlabApputils.anon.PartialIModel
import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`type`
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.name
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.path
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.Status
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IKernelChangedArgs
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientSession_ extends IDisposable {
  /**
    * A signal emitted for a kernel messages.
    */
  val iopubMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Whether the session is ready.
    */
  val isReady: Boolean = js.native
  /**
    * The current kernel associated with the document.
    */
  val kernel: IKernelConnection | Null = js.native
  /**
    * A signal emitted when the kernel changes.
    */
  val kernelChanged: ISignal[this.type, IKernelChangedArgs] = js.native
  /**
    * The display name of the kernel.
    */
  val kernelDisplayName: String = js.native
  /**
    * The kernel preference.
    */
  var kernelPreference: IKernelPreference = js.native
  /**
    * The current name associated with the client session.
    */
  val name: String = js.native
  /**
    * The current path associated with the client session.
    */
  val path: String = js.native
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: ISignal[
    this.type, 
    typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.path | typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.name | typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`type`
  ] = js.native
  /**
    * A promise that is fulfilled when the session is ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * The current status of the client session.
    */
  val status: Status = js.native
  /**
    * A signal emitted when the kernel status changes.
    */
  val statusChanged: ISignal[this.type, Status] = js.native
  /**
    * A signal emitted when the session is shut down.
    */
  val terminated: ISignal[this.type, Unit] = js.native
  /**
    * The type of the client session.
    */
  val `type`: String = js.native
  /**
    * A signal emitted for an unhandled kernel message.
    */
  val unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Change the current kernel associated with the document.
    */
  def changeKernel(options: PartialIModel): js.Promise[IKernelConnection] = js.native
  /**
    * Restart the session.
    *
    * @returns A promise that resolves with whether the kernel has restarted.
    *
    * #### Notes
    * If there is a running kernel, present a dialog.
    * If there is no kernel, we start a kernel with the last run
    * kernel name and resolves with `true`. If no kernel has been started,
    * this is a no-op, and resolves with `false`.
    */
  def restart(): js.Promise[Boolean] = js.native
  /**
    * Select a kernel for the session.
    */
  def selectKernel(): js.Promise[Unit] = js.native
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
    */
  def shutdown(): js.Promise[Unit] = js.native
}

object IClientSession_ {
  @scala.inline
  def apply(
    changeKernel: PartialIModel => js.Promise[IKernelConnection],
    dispose: () => Unit,
    iopubMessage: ISignal[IClientSession_, IMessage[MessageType]],
    isDisposed: Boolean,
    isReady: Boolean,
    kernelChanged: ISignal[IClientSession_, IKernelChangedArgs],
    kernelDisplayName: String,
    kernelPreference: IKernelPreference,
    name: String,
    path: String,
    propertyChanged: ISignal[IClientSession_, path | name | `type`],
    ready: js.Promise[Unit],
    restart: () => js.Promise[Boolean],
    selectKernel: () => js.Promise[Unit],
    setName: String => js.Promise[Unit],
    setPath: String => js.Promise[Unit],
    setType: String => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    status: Status,
    statusChanged: ISignal[IClientSession_, Status],
    terminated: ISignal[IClientSession_, Unit],
    `type`: String,
    unhandledMessage: ISignal[IClientSession_, IMessage[MessageType]]
  ): IClientSession_ = {
    val __obj = js.Dynamic.literal(changeKernel = js.Any.fromFunction1(changeKernel), dispose = js.Any.fromFunction0(dispose), iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], kernelDisplayName = kernelDisplayName.asInstanceOf[js.Any], kernelPreference = kernelPreference.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restart = js.Any.fromFunction0(restart), selectKernel = js.Any.fromFunction0(selectKernel), setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), status = status.asInstanceOf[js.Any], statusChanged = statusChanged.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientSession_]
  }
  @scala.inline
  implicit class IClientSession_Ops[Self <: IClientSession_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeKernel(value: PartialIModel => js.Promise[IKernelConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIopubMessage(value: ISignal[IClientSession_, IMessage[MessageType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iopubMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelChanged(value: ISignal[IClientSession_, IKernelChangedArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelPreference(value: IKernelPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(value.asInstanceOf[js.Any])
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
    def withPropertyChanged(value: ISignal[IClientSession_, path | name | `type`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestart(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectKernel(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectKernel")(js.Any.fromFunction0(value))
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
    def withStatusChanged(value: ISignal[IClientSession_, Status]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminated(value: ISignal[IClientSession_, Unit]): Self = {
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
    def withUnhandledMessage(value: ISignal[IClientSession_, IMessage[MessageType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernel(value: IKernelConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(null)
        ret
    }
  }
  
}

