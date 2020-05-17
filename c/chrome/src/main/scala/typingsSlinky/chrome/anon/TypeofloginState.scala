package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.loginState.ProfileType
import typingsSlinky.chrome.chrome.loginState.SessionState
import typingsSlinky.chrome.chrome.loginState.SessionStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofloginState extends js.Object {
  val onSessionStateChanged: SessionStateChangedEvent = js.native
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit = js.native
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit = js.native
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
  implicit class TypeofloginStateOps[Self <: TypeofloginState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetProfileType(value: js.Function1[/* profileType */ ProfileType, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfileType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSessionState(value: js.Function1[/* sessionState */ SessionState, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSessionState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSessionStateChanged(value: SessionStateChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSessionStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

