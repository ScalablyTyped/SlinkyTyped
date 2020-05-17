package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForMesh
*/
trait TypeScheme extends js.Object

object TypeScheme {
  @scala.inline
  implicit def apply(value: TypeSchemeForMesh): TypeScheme = value.asInstanceOf[TypeScheme]
  @scala.inline
  implicit def apply(value: TypeSchemeForPoint): TypeScheme = value.asInstanceOf[TypeScheme]
  @scala.inline
  implicit def apply(value: TypeSchemeForPolygon): TypeScheme = value.asInstanceOf[TypeScheme]
  @scala.inline
  implicit def apply(value: TypeSchemeForPolyline): TypeScheme = value.asInstanceOf[TypeScheme]
}

