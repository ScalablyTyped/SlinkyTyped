package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break should be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderBreaks]] = js.native
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var style: js.UndefOr[ClassedSizeSliderStyleProperties] = js.native
  /**
    * The view model for the ClassedSizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ClassedSizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html) class to access all properties and methods on the ClassedSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedSizeSliderViewModelProperties] = js.native
}

object ClassedSizeSliderProperties {
  @scala.inline
  def apply(): ClassedSizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderProperties]
  }
  @scala.inline
  implicit class ClassedSizeSliderPropertiesOps[Self <: ClassedSizeSliderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreaks(value: js.Array[ClassedSizeSliderBreaks]): Self = {
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
    @scala.inline
    def withStyle(value: ClassedSizeSliderStyleProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: ClassedSizeSliderViewModelProperties): Self = {
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

