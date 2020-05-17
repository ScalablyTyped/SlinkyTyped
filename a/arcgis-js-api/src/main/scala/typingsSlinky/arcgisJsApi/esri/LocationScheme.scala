package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForMesh
*/
trait LocationScheme extends js.Object

object LocationScheme {
  @scala.inline
  implicit def apply(value: LocationSchemeForMesh): LocationScheme = value.asInstanceOf[LocationScheme]
  @scala.inline
  implicit def apply(value: LocationSchemeForPoint): LocationScheme = value.asInstanceOf[LocationScheme]
  @scala.inline
  implicit def apply(value: LocationSchemeForPolygon): LocationScheme = value.asInstanceOf[LocationScheme]
  @scala.inline
  implicit def apply(value: LocationSchemeForPolyline): LocationScheme = value.asInstanceOf[LocationScheme]
}

