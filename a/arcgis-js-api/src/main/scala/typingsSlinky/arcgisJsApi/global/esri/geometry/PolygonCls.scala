package typingsSlinky.arcgisJsApi.global.esri.geometry

import typingsSlinky.arcgisJsApi.esri.PolygonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.geometry.Polygon")
@js.native
/**
  * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference). Each ring is represented as an array of points. The first and last points of a ring must be the same. A polygon also has boolean-valued [hasM](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) and [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  */
class PolygonCls ()
  extends typingsSlinky.arcgisJsApi.esri.Polygon {
  def this(properties: PolygonProperties) = this()
}
