package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.loginState.ProfileType
import typingsSlinky.chrome.chrome.loginState.SessionState
import typingsSlinky.chrome.chrome.loginState.SessionStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofloginState extends StObject {
  
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit = js.native
  
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit = js.native
  
  val onSessionStateChanged: SessionStateChangedEvent = js.native
}
object TypeofloginState {
  
  @scala.inline
  def apply(
    getProfileType: js.Function1[/* profileType */ ProfileType, Unit] => Unit,
    getSessionState: js.Function1[/* sessionState */ SessionState, Unit] => Unit,
    onSessionStateChanged: SessionStateChangedEvent
  ): TypeofloginState = {
    val __obj = js.Dynamic.literal(getProfileType = js.Any.fromFunction1(getProfileType), getSessionState = js.Any.fromFunction1(getSessionState), onSessionStateChanged = onSessionStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofloginState]
  }
  
  @scala.inline
  implicit class TypeofloginStateMutableBuilder[Self <: TypeofloginState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetProfileType(value: js.Function1[/* profileType */ ProfileType, Unit] => Unit): Self = StObject.set(x, "getProfileType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionState(value: js.Function1[/* sessionState */ SessionState, Unit] => Unit): Self = StObject.set(x, "getSessionState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSessionStateChanged(value: SessionStateChangedEvent): Self = StObject.set(x, "onSessionStateChanged", value.asInstanceOf[js.Any])
  }
}
