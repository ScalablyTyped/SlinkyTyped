package typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnViewTapListener extends js.Object {
  def onViewTap(view: View, x: Double, y: Double): Unit = js.native
}

object OnViewTapListener {
  @scala.inline
  def apply(onViewTap: (View, Double, Double) => Unit): OnViewTapListener = {
    val __obj = js.Dynamic.literal(onViewTap = js.Any.fromFunction3(onViewTap))
    __obj.asInstanceOf[OnViewTapListener]
  }
  @scala.inline
  implicit class OnViewTapListenerOps[Self <: OnViewTapListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnViewTap(value: (View, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewTap")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

