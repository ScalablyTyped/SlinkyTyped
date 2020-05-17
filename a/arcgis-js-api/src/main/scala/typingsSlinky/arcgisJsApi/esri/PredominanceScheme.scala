package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.PredominanceSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.PredominanceSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.PredominanceSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.PredominanceSchemeForMesh
*/
trait PredominanceScheme extends js.Object

object PredominanceScheme {
  @scala.inline
  implicit def apply(value: PredominanceSchemeForMesh): PredominanceScheme = value.asInstanceOf[PredominanceScheme]
  @scala.inline
  implicit def apply(value: PredominanceSchemeForPoint): PredominanceScheme = value.asInstanceOf[PredominanceScheme]
  @scala.inline
  implicit def apply(value: PredominanceSchemeForPolygon): PredominanceScheme = value.asInstanceOf[PredominanceScheme]
  @scala.inline
  implicit def apply(value: PredominanceSchemeForPolyline): PredominanceScheme = value.asInstanceOf[PredominanceScheme]
}

