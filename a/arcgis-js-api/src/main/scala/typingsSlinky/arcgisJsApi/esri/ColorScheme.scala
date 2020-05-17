package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.ColorSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.ColorSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.ColorSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.ColorSchemeForMesh
*/
trait ColorScheme extends js.Object

object ColorScheme {
  @scala.inline
  implicit def apply(value: ColorSchemeForMesh): ColorScheme = value.asInstanceOf[ColorScheme]
  @scala.inline
  implicit def apply(value: ColorSchemeForPoint): ColorScheme = value.asInstanceOf[ColorScheme]
  @scala.inline
  implicit def apply(value: ColorSchemeForPolygon): ColorScheme = value.asInstanceOf[ColorScheme]
  @scala.inline
  implicit def apply(value: ColorSchemeForPolyline): ColorScheme = value.asInstanceOf[ColorScheme]
}

