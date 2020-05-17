package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.SizeSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.SizeSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.SizeSchemeForPolygon
*/
trait SizeScheme extends js.Object

object SizeScheme {
  @scala.inline
  implicit def apply(value: SizeSchemeForPoint): SizeScheme = value.asInstanceOf[SizeScheme]
  @scala.inline
  implicit def apply(value: SizeSchemeForPolygon): SizeScheme = value.asInstanceOf[SizeScheme]
  @scala.inline
  implicit def apply(value: SizeSchemeForPolyline): SizeScheme = value.asInstanceOf[SizeScheme]
}

