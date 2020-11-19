package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewpoint
  extends Accessor
     with JSONSupport
     with _GoToTarget2D
     with _GoToTarget3D {
  
  /**
    * The viewpoint camera (3D only).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#camera)
    */
  var camera: Camera = js.native
  
  /**
    * The rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation)
    *
    * @default 0
    */
  var rotation: Double = js.native
  
  /**
    * The scale of the viewpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * The target geometry framed by the viewpoint.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry)
    */
  var targetGeometry: Geometry_ = js.native
}
