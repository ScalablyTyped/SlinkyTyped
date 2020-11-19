package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.GroupLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GroupLayer")
@js.native
/**
  * GroupLayer provides the ability to organize several sublayers into one common layer. Suppose there are several [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that all represent water features in different dimensions. For example, wells (points), streams (lines), and lakes (polygons). The GroupLayer provides the functionality to treat them as one layer called "Water Features" even though they are stored as separate feature layers. To accomplish this, create a new GroupLayer and use the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#add) method to add each of the water layers to the GroupLayer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html)
  */
class GroupLayerCls ()
  extends typingsSlinky.arcgisJsApi.esri.GroupLayer {
  def this(properties: GroupLayerProperties) = this()
}
