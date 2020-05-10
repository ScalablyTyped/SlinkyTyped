package typingsSlinky.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalDimensionsParameter extends js.Object {
  var imageDisplayHeight: Double = js.native
  var imageDisplayWidth: Double = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object IModalDimensionsParameter {
  @scala.inline
  def apply(imageDisplayHeight: Double, imageDisplayWidth: Double, windowHeight: Double, windowWidth: Double): IModalDimensionsParameter = {
    val __obj = js.Dynamic.literal(imageDisplayHeight = imageDisplayHeight.asInstanceOf[js.Any], imageDisplayWidth = imageDisplayWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalDimensionsParameter]
  }
  @scala.inline
  implicit class IModalDimensionsParameterOps[Self <: IModalDimensionsParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDisplayHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageDisplayWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

