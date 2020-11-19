package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-unique-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudUniqueValueRenderer
  extends PointCloudRenderer
     with typingsSlinky.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  
  /**
    * Each element in the array is an object that matches a unique value with a specific color. Features with equal values to those specified here will be assigned the associated color. For example, you may choose to visualize points representing low vegetation with a green color and points representing power lines with a gray color. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos] = js.native
  
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudUniqueValueRendererLegendOptions = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudUniqueValueRenderer: `point-cloud-unique-value` = js.native
}
