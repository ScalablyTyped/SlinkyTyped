package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-class-breaks`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-rgb`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-stretch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-unique-value`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudRenderer
  extends Accessor
     with JSONSupport {
  
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`. High values leave the color unchanged, while low values darken the color of the point. This helps to display the scanned surface in a more realistic way.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: PointCloudRendererColorModulation = js.native
  
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.  The splat algorithm automatically computes a size based on the density, which varies with the Level of Detail that is currently displayed.  The fixed size algorithm displays all points with the same size, either in screen space or real world units.  When `pointSizeAlgorithm` is not set, the default is `splat`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = js.native
  
  /**
    * The number of points to draw per display inch. This property determines the level of detail in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    *
    * @default 10
    */
  var pointsPerInch: Double = js.native
  
  /**
    * The point cloud renderer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#type)
    */
  val `type`: `point-cloud-class-breaks` | `point-cloud-rgb` | `point-cloud-stretch` | `point-cloud-unique-value` = js.native
}
