package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Feet
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Kilometers
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Meters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Miles
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTemplateLayoutOptions extends Object {
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: js.UndefOr[String] = js.native
  /**
    * The text used for the copyright if the specified layout contains a copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: js.UndefOr[String] = js.native
  /**
    * An array of name-value pair objects. Use this property to update the text for custom text elements on the page layout. Values must be strings. The custom text elements must exist in the print service. All out-of-the-box print service layout templates contain a text element named `date` that gets populated by default with the system date-time, but can be overwritten.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the ids of the layers that will be included in the legend. Tiled layers and GraphicsLayer will not appear in the legend. If `legendLayers` is not specified, all operational layers (non-tiled layers) except [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) will be present in the legend. To specify that no layers will be included in the legend, set `legendLayer = []`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.UndefOr[js.Array[LegendLayer]] = js.native
  /**
    * The unit used for the scalebar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    *
    * @default Miles
    */
  var scalebarUnit: js.UndefOr[Miles | Kilometers | Meters | Feet] = js.native
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: js.UndefOr[String] = js.native
}

object PrintTemplateLayoutOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
  @scala.inline
  implicit class PrintTemplateLayoutOptionsOps[Self <: PrintTemplateLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorText")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyrightText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyrightText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightText")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTextElements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTextElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTextElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTextElements")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendLayers(value: js.Array[LegendLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withScalebarUnit(value: Miles | Kilometers | Meters | Feet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalebarUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalebarUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalebarUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
  }
  
}

