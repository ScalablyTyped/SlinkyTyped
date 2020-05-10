package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait univariateColorSizeCreateContinuousRendererParamsSizeOptions extends Object {
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions] = js.native
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.native
}

object univariateColorSizeCreateContinuousRendererParamsSizeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateContinuousRendererParamsSizeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSizeOptions]
  }
  @scala.inline
  implicit class univariateColorSizeCreateContinuousRendererParamsSizeOptionsOps[Self <: univariateColorSizeCreateContinuousRendererParamsSizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegendOptions(value: univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeScheme(value: SizeScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeScheme")(js.undefined)
        ret
    }
  }
  
}

