package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSliderProperties extends WidgetProperties {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.native
  /**
    * The view model for the Heatmap widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the module:esri/widgets/smartMapping/HeatmapSlider/HeatmapliderViewModel class to access all properties and methods on the HeatmapSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HeatmapSliderViewModelProperties] = js.native
}

object HeatmapSliderProperties {
  @scala.inline
  def apply(): HeatmapSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderProperties]
  }
  @scala.inline
  implicit class HeatmapSliderPropertiesOps[Self <: HeatmapSliderProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withViewModel(value: HeatmapSliderViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

