package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.native
}

object HeatmapSliderViewModelProperties {
  @scala.inline
  def apply(): HeatmapSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderViewModelProperties]
  }
  @scala.inline
  implicit class HeatmapSliderViewModelPropertiesOps[Self <: HeatmapSliderViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStops(value: js.Array[HeatmapColorStopProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
  }
  
}

