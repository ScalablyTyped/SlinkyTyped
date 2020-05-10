package typingsSlinky.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikGetFromCameraCallbacks extends js.Object {
  def onCancel(): Unit = js.native
  def onComplete(photos: js.Array[String]): Unit = js.native
  def onPhoto(photo: String, index: Double): Unit = js.native
  def onSelect(numPhotos: Double): Unit = js.native
}

object KikGetFromCameraCallbacks {
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onComplete: js.Array[String] => Unit,
    onPhoto: (String, Double) => Unit,
    onSelect: Double => Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
  @scala.inline
  implicit class KikGetFromCameraCallbacksOps[Self <: KikGetFromCameraCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnComplete(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPhoto(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPhoto")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

