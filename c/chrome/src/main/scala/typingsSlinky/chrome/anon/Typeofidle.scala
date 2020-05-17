package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.idle.IdleState
import typingsSlinky.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofidle extends js.Object {
  var onStateChanged: IdleStateChangedEvent = js.native
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = js.native
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}

object Typeofidle {
  @scala.inline
  def apply(
    getAutoLockDelay: js.Function1[/* delay */ Double, Unit] => Unit,
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit,
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(getAutoLockDelay = js.Any.fromFunction1(getAutoLockDelay), onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
  @scala.inline
  implicit class TypeofidleOps[Self <: Typeofidle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAutoLockDelay(value: js.Function1[/* delay */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoLockDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStateChanged(value: IdleStateChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryState(value: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryState")(js.Any.fromFunction2(value))
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

