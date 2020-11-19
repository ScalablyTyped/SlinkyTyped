package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousRendererResultColor extends Object {
  
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
    */
  var colorScheme: ColorScheme = js.native
  
  /**
    * A color visual variable configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
    */
  var visualVariable: ColorVariable = js.native
}
object ContinuousRendererResultColor {
  
  @scala.inline
  def apply(
    colorScheme: ColorScheme,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    visualVariable: ColorVariable
  ): ContinuousRendererResultColor = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousRendererResultColor]
  }
  
  @scala.inline
  implicit class ContinuousRendererResultColorOps[Self <: ContinuousRendererResultColor] (val x: Self) extends AnyVal {
    
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
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariable(value: ColorVariable): Self = this.set("visualVariable", value.asInstanceOf[js.Any])
  }
}
