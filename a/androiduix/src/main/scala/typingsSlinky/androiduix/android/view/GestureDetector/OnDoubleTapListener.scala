package typingsSlinky.androiduix.android.view.GestureDetector

import typingsSlinky.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDoubleTapListener extends js.Object {
  def onDoubleTap(e: MotionEvent): Boolean = js.native
  def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
  def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
}

object OnDoubleTapListener {
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => Boolean,
    onDoubleTapEvent: MotionEvent => Boolean,
    onSingleTapConfirmed: MotionEvent => Boolean
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed))
    __obj.asInstanceOf[OnDoubleTapListener]
  }
  @scala.inline
  implicit class OnDoubleTapListenerOps[Self <: OnDoubleTapListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDoubleTap(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDoubleTapEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleTapEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSingleTapConfirmed(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSingleTapConfirmed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

