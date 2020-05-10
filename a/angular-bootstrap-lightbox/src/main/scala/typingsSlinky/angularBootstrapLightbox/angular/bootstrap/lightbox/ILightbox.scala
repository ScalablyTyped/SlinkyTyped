package typingsSlinky.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILightbox extends js.Object {
  def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit = js.native
}

object ILightbox {
  @scala.inline
  def apply(openModal: (js.Array[ILightboxImageInfo], Double) => Unit): ILightbox = {
    val __obj = js.Dynamic.literal(openModal = js.Any.fromFunction2(openModal))
    __obj.asInstanceOf[ILightbox]
  }
  @scala.inline
  implicit class ILightboxOps[Self <: ILightbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenModal(value: (js.Array[ILightboxImageInfo], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openModal")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

