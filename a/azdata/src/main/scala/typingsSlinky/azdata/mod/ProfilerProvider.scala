package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilerProvider extends DataProvider {
  def connectSession(sessionId: String): Thenable[Boolean] = js.native
  def createSession(sessionId: String, sessionName: String, template: ProfilerSessionTemplate): Thenable[Boolean] = js.native
  def disconnectSession(sessionId: String): Thenable[Boolean] = js.native
  def getXEventSessions(sessionId: String): Thenable[js.Array[String]] = js.native
  def pauseSession(sessionId: String): Thenable[Boolean] = js.native
  def registerOnProfilerSessionCreated(handler: js.Function1[/* response */ ProfilerSessionCreatedParams, _]): Unit = js.native
  def registerOnSessionEventsAvailable(handler: js.Function1[/* response */ ProfilerSessionEvents, _]): Unit = js.native
  def registerOnSessionStopped(handler: js.Function1[/* response */ ProfilerSessionStoppedParams, _]): Unit = js.native
  def startSession(sessionId: String, sessionName: String): Thenable[Boolean] = js.native
  def stopSession(sessionId: String): Thenable[Boolean] = js.native
}

object ProfilerProvider {
  @scala.inline
  def apply(
    connectSession: String => Thenable[Boolean],
    createSession: (String, String, ProfilerSessionTemplate) => Thenable[Boolean],
    disconnectSession: String => Thenable[Boolean],
    getXEventSessions: String => Thenable[js.Array[String]],
    pauseSession: String => Thenable[Boolean],
    providerId: String,
    registerOnProfilerSessionCreated: js.Function1[/* response */ ProfilerSessionCreatedParams, _] => Unit,
    registerOnSessionEventsAvailable: js.Function1[/* response */ ProfilerSessionEvents, _] => Unit,
    registerOnSessionStopped: js.Function1[/* response */ ProfilerSessionStoppedParams, _] => Unit,
    startSession: (String, String) => Thenable[Boolean],
    stopSession: String => Thenable[Boolean]
  ): ProfilerProvider = {
    val __obj = js.Dynamic.literal(connectSession = js.Any.fromFunction1(connectSession), createSession = js.Any.fromFunction3(createSession), disconnectSession = js.Any.fromFunction1(disconnectSession), getXEventSessions = js.Any.fromFunction1(getXEventSessions), pauseSession = js.Any.fromFunction1(pauseSession), providerId = providerId.asInstanceOf[js.Any], registerOnProfilerSessionCreated = js.Any.fromFunction1(registerOnProfilerSessionCreated), registerOnSessionEventsAvailable = js.Any.fromFunction1(registerOnSessionEventsAvailable), registerOnSessionStopped = js.Any.fromFunction1(registerOnSessionStopped), startSession = js.Any.fromFunction2(startSession), stopSession = js.Any.fromFunction1(stopSession))
    __obj.asInstanceOf[ProfilerProvider]
  }
  @scala.inline
  implicit class ProfilerProviderOps[Self <: ProfilerProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectSession(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSession(value: (String, String, ProfilerSessionTemplate) => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSession")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDisconnectSession(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetXEventSessions(value: String => Thenable[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXEventSessions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPauseSession(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnProfilerSessionCreated(value: js.Function1[/* response */ ProfilerSessionCreatedParams, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnProfilerSessionCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnSessionEventsAvailable(value: js.Function1[/* response */ ProfilerSessionEvents, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnSessionEventsAvailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnSessionStopped(value: js.Function1[/* response */ ProfilerSessionStoppedParams, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnSessionStopped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartSession(value: (String, String) => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSession")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStopSession(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSession")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

