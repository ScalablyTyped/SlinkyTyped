package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ProfilerProviderMutableBuilder[Self <: ProfilerProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "connectSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSession(value: (String, String, ProfilerSessionTemplate) => Thenable[Boolean]): Self = StObject.set(x, "createSession", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDisconnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "disconnectSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetXEventSessions(value: String => Thenable[js.Array[String]]): Self = StObject.set(x, "getXEventSessions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPauseSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "pauseSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnProfilerSessionCreated(value: js.Function1[/* response */ ProfilerSessionCreatedParams, _] => Unit): Self = StObject.set(x, "registerOnProfilerSessionCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnSessionEventsAvailable(value: js.Function1[/* response */ ProfilerSessionEvents, _] => Unit): Self = StObject.set(x, "registerOnSessionEventsAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnSessionStopped(value: js.Function1[/* response */ ProfilerSessionStoppedParams, _] => Unit): Self = StObject.set(x, "registerOnSessionStopped", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartSession(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "startSession", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "stopSession", js.Any.fromFunction1(value))
  }
}
