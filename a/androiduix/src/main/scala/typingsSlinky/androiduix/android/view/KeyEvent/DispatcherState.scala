package typingsSlinky.androiduix.android.view.KeyEvent

import typingsSlinky.androiduix.android.util.SparseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherState extends js.Object {
  var mActiveLongPresses: SparseArray[Double] = js.native
  var mDownKeyCode: Double = js.native
  var mDownTarget: js.Any = js.native
  def handleUpEvent(event: typingsSlinky.androiduix.android.view.KeyEvent): Unit = js.native
  def isTracking(event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean = js.native
  def performedLongPress(event: typingsSlinky.androiduix.android.view.KeyEvent): Unit = js.native
  def reset(target: js.Any): Unit = js.native
  def startTracking(event: typingsSlinky.androiduix.android.view.KeyEvent, target: js.Any): Unit = js.native
}

object DispatcherState {
  @scala.inline
  def apply(
    handleUpEvent: typingsSlinky.androiduix.android.view.KeyEvent => Unit,
    isTracking: typingsSlinky.androiduix.android.view.KeyEvent => Boolean,
    mActiveLongPresses: SparseArray[Double],
    mDownKeyCode: Double,
    mDownTarget: js.Any,
    performedLongPress: typingsSlinky.androiduix.android.view.KeyEvent => Unit,
    reset: js.Any => Unit,
    startTracking: (typingsSlinky.androiduix.android.view.KeyEvent, js.Any) => Unit
  ): DispatcherState = {
    val __obj = js.Dynamic.literal(handleUpEvent = js.Any.fromFunction1(handleUpEvent), isTracking = js.Any.fromFunction1(isTracking), mActiveLongPresses = mActiveLongPresses.asInstanceOf[js.Any], mDownKeyCode = mDownKeyCode.asInstanceOf[js.Any], mDownTarget = mDownTarget.asInstanceOf[js.Any], performedLongPress = js.Any.fromFunction1(performedLongPress), reset = js.Any.fromFunction1(reset), startTracking = js.Any.fromFunction2(startTracking))
    __obj.asInstanceOf[DispatcherState]
  }
  @scala.inline
  implicit class DispatcherStateOps[Self <: DispatcherState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleUpEvent(value: typingsSlinky.androiduix.android.view.KeyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUpEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTracking(value: typingsSlinky.androiduix.android.view.KeyEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTracking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMActiveLongPresses(value: SparseArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActiveLongPresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDownKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDownKeyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDownTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDownTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformedLongPress(value: typingsSlinky.androiduix.android.view.KeyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performedLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartTracking(value: (typingsSlinky.androiduix.android.view.KeyEvent, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTracking")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

