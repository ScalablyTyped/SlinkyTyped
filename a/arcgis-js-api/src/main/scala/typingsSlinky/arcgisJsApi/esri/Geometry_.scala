package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry_
  extends Accessor
     with JSONSupport
     with _GoToTarget2D
     with _GoToTarget3D {
  
  /**
    * The cache is used to store values computed from geometries that need to cleared or recomputed upon mutation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#cache)
    */
  val cache: js.Any = js.native
  
  /**
    * The extent of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#extent)
    */
  val extent: Extent = js.native
  
  /**
    * Indicates if the geometry has M values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasM)
    */
  var hasM: Boolean = js.native
  
  /**
    * Indicates if the geometry has z-values (elevation).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasZ)
    */
  var hasZ: Boolean = js.native
  
  /**
    * The spatial reference of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type)
    */
  val `type`: point | multipoint | polyline | polygon | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extent | mesh = js.native
}
