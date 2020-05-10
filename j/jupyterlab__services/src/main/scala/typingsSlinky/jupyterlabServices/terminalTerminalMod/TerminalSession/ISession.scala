package typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a terminal session.
  */
@js.native
trait ISession extends IDisposable {
  /**
    * Test whether the session is ready.
    */
  val isReady: Boolean = js.native
  /**
    * A signal emitted when a message is received from the server.
    */
  var messageReceived: ISignal[ISession, IMessage] = js.native
  /**
    * The model associated with the session.
    */
  val model: IModel = js.native
  /**
    * Get the name of the terminal session.
    */
  val name: String = js.native
  /**
    * A promise that fulfills when the session is initially ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * The server settings for the session.
    */
  val serverSettings: ISettings = js.native
  /**
    * A signal emitted when the session is shut down.
    */
  var terminated: ISignal[ISession, Unit] = js.native
  /**
    * Reconnect to the terminal.
    *
    * @returns A promise that resolves when the terminal has reconnected.
    */
  def reconnect(): js.Promise[Unit] = js.native
  /**
    * Send a message to the terminal session.
    */
  def send(message: IMessage): Unit = js.native
  /**
    * Shut down the terminal session.
    */
  def shutdown(): js.Promise[Unit] = js.native
}

object ISession {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    isReady: Boolean,
    messageReceived: ISignal[ISession, IMessage],
    model: IModel,
    name: String,
    ready: js.Promise[Unit],
    reconnect: () => js.Promise[Unit],
    send: IMessage => Unit,
    serverSettings: ISettings,
    shutdown: () => js.Promise[Unit],
    terminated: ISignal[ISession, Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], reconnect = js.Any.fromFunction0(reconnect), send = js.Any.fromFunction1(send), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown), terminated = terminated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageReceived(value: ISignal[ISession, IMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageReceived")(value.asInstanceOf[js.Any])
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
    def withReady(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnect(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: IMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withServerSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdown(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTerminated(value: ISignal[ISession, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

