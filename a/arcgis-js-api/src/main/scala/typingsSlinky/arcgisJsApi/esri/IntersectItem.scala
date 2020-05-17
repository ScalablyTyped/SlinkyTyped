package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.Graphic
  - typingsSlinky.arcgisJsApi.esri.Layer
  - typingsSlinky.arcgisJsApi.esri.BuildingSublayer
*/
trait IntersectItem extends js.Object

object IntersectItem {
  @scala.inline
  implicit def apply(value: BuildingSublayer): IntersectItem = value.asInstanceOf[IntersectItem]
  @scala.inline
  implicit def apply(value: Graphic): IntersectItem = value.asInstanceOf[IntersectItem]
  @scala.inline
  implicit def apply(value: Layer): IntersectItem = value.asInstanceOf[IntersectItem]
}

