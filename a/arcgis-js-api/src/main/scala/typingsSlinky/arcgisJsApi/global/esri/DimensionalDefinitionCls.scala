package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.DimensionalDefinitionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DimensionalDefinition")
@js.native
/**
  * A dimensional definition defines a filter based on one variable and one dimension. You can filter with one or multiple dimensional slices. Instances of this class are typically used when filtering data based on [slices](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice) or ranges in one or more dimensions with [MosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html)
  */
class DimensionalDefinitionCls ()
  extends typingsSlinky.arcgisJsApi.esri.DimensionalDefinition {
  def this(properties: DimensionalDefinitionProperties) = this()
}
