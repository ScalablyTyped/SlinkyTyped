package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.ColorVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorVariable")
@js.native
/**
  * The color visual variable is used to visualize features along a continuous color ramp based on the values of a numeric attribute [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#field) or an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#valueExpression). The color ramp is defined along a sequence of [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops), where color values are mapped to data values. Data values that fall between two stops are assigned a color that is linearly interpolated based on the value's position relative to the closest defined stops.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html)
  */
class ColorVariableCls ()
  extends typingsSlinky.arcgisJsApi.esri.ColorVariable {
  def this(properties: ColorVariableProperties) = this()
}
