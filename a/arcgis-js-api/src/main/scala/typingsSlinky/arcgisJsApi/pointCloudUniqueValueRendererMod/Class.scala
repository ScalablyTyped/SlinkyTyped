package typingsSlinky.arcgisJsApi.pointCloudUniqueValueRendererMod

import typingsSlinky.arcgisJsApi.esri.PointCloudUniqueValueRenderer
import typingsSlinky.arcgisJsApi.esri.PointCloudUniqueValueRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/renderers/PointCloudUniqueValueRenderer", JSImport.Namespace)
@js.native
/**
  * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value. This is done by assigning unique colors to represent points with equal attribute values. This renderer is used to visualize points of the same type, not interpolate colors along a continuous ramp mapped to numbers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
  */
class Class () extends PointCloudUniqueValueRenderer {
  def this(properties: PointCloudUniqueValueRendererProperties) = this()
}
