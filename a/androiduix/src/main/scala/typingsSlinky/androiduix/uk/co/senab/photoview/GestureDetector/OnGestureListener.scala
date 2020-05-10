package typingsSlinky.androiduix.uk.co.senab.photoview.GestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGestureListener extends js.Object {
  def onDrag(dx: Double, dy: Double): Unit = js.native
  def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit = js.native
  def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDrag: (Double, Double) => Unit,
    onFling: (Double, Double, Double, Double) => Unit,
    onScale: (Double, Double, Double) => Unit
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal(onDrag = js.Any.fromFunction2(onDrag), onFling = js.Any.fromFunction4(onFling), onScale = js.Any.fromFunction3(onScale))
    __obj.asInstanceOf[OnGestureListener]
  }
  @scala.inline
  implicit class OnGestureListenerOps[Self <: OnGestureListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDrag(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnFling(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFling")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnScale(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScale")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

