package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.idle.IdleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofidle extends js.Object {
  /* idle events */
  /**
    * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not
    * generated any input for a specified number of seconds, and "active" when the user generates input on an idle
    * system.
    */
  val onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]] = js.native
  /* idle functions */
  /**
    * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have
    *     elapsed since the last user input detected.
    */
  def queryState(detectionIntervalInSeconds: Double): js.Promise[IdleState] = js.native
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events.
    * The default interval is 60 seconds.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}

object Typeofidle {
  @scala.inline
  def apply(
    onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]],
    queryState: Double => js.Promise[IdleState],
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction1(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
  @scala.inline
  implicit class TypeofidleOps[Self <: Typeofidle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnStateChanged(value: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryState(value: Double => js.Promise[IdleState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDetectionInterval(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetectionInterval")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

