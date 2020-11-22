package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry.html)
  */
@JSGlobal("__esri.geometry")
@js.native
object geometry extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.arcgisJsApi.esri.Extent
    - typingsSlinky.arcgisJsApi.esri.Multipoint
    - typingsSlinky.arcgisJsApi.esri.Point
    - typingsSlinky.arcgisJsApi.esri.Polygon
    - typingsSlinky.arcgisJsApi.esri.Polyline
    - typingsSlinky.arcgisJsApi.esri.Mesh
  */
  trait Geometry extends js.Object
  
  type Extent = typingsSlinky.arcgisJsApi.esri.Extent
  
  type Mesh = typingsSlinky.arcgisJsApi.esri.Mesh
  
  type Multipoint = typingsSlinky.arcgisJsApi.esri.Multipoint
  
  type Point = typingsSlinky.arcgisJsApi.esri.Point
  
  type Polygon = typingsSlinky.arcgisJsApi.esri.Polygon
  
  type Polyline = typingsSlinky.arcgisJsApi.esri.Polyline
  
  type SpatialReference = typingsSlinky.arcgisJsApi.esri.SpatialReference
}
