package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.captivePortal.Status
import typingsSlinky.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcaptivePortal extends js.Object {
  /**
    * This notification will be emitted when the captive portal service has determined that we can connect to the
    * internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if
    * no captive portal was detected.
    */
  val onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]] = js.native
  /* captivePortal events */
  /** Fired when the captive portal state changes. */
  val onStateChanged: WebExtEvent[js.Function1[/* details */ AnonState, Unit]] = js.native
  /** Returns the time difference between NOW and the last time a request was completed in milliseconds. */
  def getLastChecked(): js.Promise[Double] = js.native
  /* captivePortal functions */
  /**
    * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
    */
  def getState(): js.Promise[UndefinedState] = js.native
}

object TypeofcaptivePortal {
  @scala.inline
  def apply(
    getLastChecked: () => js.Promise[Double],
    getState: () => js.Promise[UndefinedState],
    onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]],
    onStateChanged: WebExtEvent[js.Function1[/* details */ AnonState, Unit]]
  ): TypeofcaptivePortal = {
    val __obj = js.Dynamic.literal(getLastChecked = js.Any.fromFunction0(getLastChecked), getState = js.Any.fromFunction0(getState), onConnectivityAvailable = onConnectivityAvailable.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofcaptivePortal]
  }
  @scala.inline
  implicit class TypeofcaptivePortalOps[Self <: TypeofcaptivePortal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLastChecked(value: () => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => js.Promise[UndefinedState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnConnectivityAvailable(value: WebExtEvent[js.Function1[/* status */ Status, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectivityAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStateChanged(value: WebExtEvent[js.Function1[/* details */ AnonState, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

