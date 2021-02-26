package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud-stretch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudStretchRenderer
  extends PointCloudRenderer
     with typingsSlinky.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  
  /**
    * The name of the number field whose values are used to drive the continuous color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
    */
  var fieldTransformType: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudStretchRendererLegendOptions = js.native
  
  /**
    * An array of color value pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var stops: js.Array[PointCloudStretchRendererStops] = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudStretchRenderer: `point-cloud-stretch` = js.native
}
