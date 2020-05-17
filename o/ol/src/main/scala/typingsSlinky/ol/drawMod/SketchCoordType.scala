package typingsSlinky.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ol.drawMod.PointCoordType
  - typingsSlinky.ol.drawMod.LineCoordType
  - typingsSlinky.ol.drawMod.PolyCoordType
*/
trait SketchCoordType extends js.Object

object SketchCoordType {
  @scala.inline
  implicit def apply(value: LineCoordType | PointCoordType | PolyCoordType): SketchCoordType = value.asInstanceOf[SketchCoordType]
}

