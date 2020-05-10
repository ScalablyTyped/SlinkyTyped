package typingsSlinky.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILightBoxProvider extends js.Object {
  var templateUrl: String = js.native
  def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits = js.native
  def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions = js.native
}

object ILightBoxProvider {
  @scala.inline
  def apply(
    calculateImageDimensionLimits: IImageDimensionParameter => IImageDimensionLimits,
    calculateModalDimensions: IModalDimensionsParameter => IModalDimensions,
    templateUrl: String
  ): ILightBoxProvider = {
    val __obj = js.Dynamic.literal(calculateImageDimensionLimits = js.Any.fromFunction1(calculateImageDimensionLimits), calculateModalDimensions = js.Any.fromFunction1(calculateModalDimensions), templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightBoxProvider]
  }
  @scala.inline
  implicit class ILightBoxProviderOps[Self <: ILightBoxProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateImageDimensionLimits(value: IImageDimensionParameter => IImageDimensionLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateImageDimensionLimits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateModalDimensions(value: IModalDimensionsParameter => IModalDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateModalDimensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

