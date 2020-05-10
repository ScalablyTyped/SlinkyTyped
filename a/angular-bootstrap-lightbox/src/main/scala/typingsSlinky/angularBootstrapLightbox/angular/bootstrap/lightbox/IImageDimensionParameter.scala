package typingsSlinky.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageDimensionParameter extends js.Object {
  var imageHeight: Double = js.native
  var imageWidth: Double = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object IImageDimensionParameter {
  @scala.inline
  def apply(imageHeight: Double, imageWidth: Double, windowHeight: Double, windowWidth: Double): IImageDimensionParameter = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageDimensionParameter]
  }
  @scala.inline
  implicit class IImageDimensionParameterOps[Self <: IImageDimensionParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
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

