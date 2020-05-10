package typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPhotoTapListener extends js.Object {
  def onPhotoTap(view: View, x: Double, y: Double): Unit = js.native
}

object OnPhotoTapListener {
  @scala.inline
  def apply(onPhotoTap: (View, Double, Double) => Unit): OnPhotoTapListener = {
    val __obj = js.Dynamic.literal(onPhotoTap = js.Any.fromFunction3(onPhotoTap))
    __obj.asInstanceOf[OnPhotoTapListener]
  }
  @scala.inline
  implicit class OnPhotoTapListenerOps[Self <: OnPhotoTapListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPhotoTap(value: (View, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPhotoTap")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

