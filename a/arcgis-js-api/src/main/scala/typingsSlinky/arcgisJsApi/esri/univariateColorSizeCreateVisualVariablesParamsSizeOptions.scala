package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.all
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.height
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait univariateColorSizeCreateVisualVariablesParamsSizeOptions extends Object {
  
  /**
    * When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    *
    * @default all
    */
  var axis: js.UndefOr[all | height] = js.native
  
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions] = js.native
  
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.native
}
object univariateColorSizeCreateVisualVariablesParamsSizeOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateVisualVariablesParamsSizeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsSizeOptions]
  }
  
  @scala.inline
  implicit class univariateColorSizeCreateVisualVariablesParamsSizeOptionsOps[Self <: univariateColorSizeCreateVisualVariablesParamsSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: all | height): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = this.set("sizeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeScheme: Self = this.set("sizeScheme", js.undefined)
  }
}
