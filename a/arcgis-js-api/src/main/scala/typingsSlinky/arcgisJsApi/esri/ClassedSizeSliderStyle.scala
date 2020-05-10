package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderStyle extends AnonymousAccessor {
  /**
    * The background color of the slider's track. Generally, this color should be subdued and not interfere with the `trackFillColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    *
    * @default new Color([224, 224, 224])
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.native
  /**
    * The color of the slider's track. For single-color visualizations where only a Size variable is present, you should set this color to match the color of the symbol in the [SimpleRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    *
    * @default new Color([149, 149, 149])
    */
  var trackFillColor: js.UndefOr[Color_] = js.native
}

object ClassedSizeSliderStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassedSizeSliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ClassedSizeSliderStyle]
  }
  @scala.inline
  implicit class ClassedSizeSliderStyleOps[Self <: ClassedSizeSliderStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackBackgroundColor(value: Color_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackFillColor(value: Color_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackFillColor")(js.undefined)
        ret
    }
  }
  
}

