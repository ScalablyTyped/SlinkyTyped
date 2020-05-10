package typingsSlinky.androiduix.android.view.ScaleGestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnScaleGestureListener extends js.Object {
  def onScale(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Boolean = js.native
  def onScaleBegin(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Boolean = js.native
  def onScaleEnd(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Unit = js.native
}

object OnScaleGestureListener {
  @scala.inline
  def apply(
    onScale: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleBegin: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleEnd: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Unit
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
    __obj.asInstanceOf[OnScaleGestureListener]
  }
  @scala.inline
  implicit class OnScaleGestureListenerOps[Self <: OnScaleGestureListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnScale(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnScaleBegin(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScaleBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnScaleEnd(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScaleEnd")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

