package typingsSlinky.jsQuantities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsQuantities.mod.Qty
  - java.lang.String
*/
trait UnitSource extends Source

object UnitSource {
  @scala.inline
  implicit def apply(value: Qty): UnitSource = value.asInstanceOf[UnitSource]
  @scala.inline
  implicit def apply(value: String): UnitSource = value.asInstanceOf[UnitSource]
}

