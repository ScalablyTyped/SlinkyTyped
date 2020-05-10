package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedColorSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderViewModelBreaks]] = js.native
}

object ClassedColorSliderViewModelProperties {
  @scala.inline
  def apply(): ClassedColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedColorSliderViewModelProperties]
  }
  @scala.inline
  implicit class ClassedColorSliderViewModelPropertiesOps[Self <: ClassedColorSliderViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreaks(value: js.Array[ClassedColorSliderViewModelBreaks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(js.undefined)
        ret
    }
  }
  
}

