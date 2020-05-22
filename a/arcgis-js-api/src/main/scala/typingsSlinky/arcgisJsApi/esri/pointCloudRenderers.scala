package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience module for importing [PointCloudRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html). For example, rather than importing renderers one at a time like this:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-pointCloudRenderers.html)
  */
@JSGlobal("__esri.pointCloudRenderers")
@js.native
object pointCloudRenderers extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.arcgisJsApi.esri.PointCloudClassBreaksRenderer
    - typingsSlinky.arcgisJsApi.esri.PointCloudRGBRenderer
    - typingsSlinky.arcgisJsApi.esri.PointCloudStretchRenderer
    - typingsSlinky.arcgisJsApi.esri.PointCloudUniqueValueRenderer
  */
  trait PointCloudRenderer extends js.Object
  
  type PointCloudClassBreaksRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudClassBreaksRenderer
  type PointCloudRGBRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudRGBRenderer
  type PointCloudStretchRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudStretchRenderer
  type PointCloudUniqueValueRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudUniqueValueRenderer
}

