package typingsSlinky.jsQuantities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsQuantities.mod.UnitSource
  - scala.Double
*/
trait Source extends js.Object

object Source {
  @scala.inline
  implicit def apply(value: Double): Source = value.asInstanceOf[Source]
  @scala.inline
  implicit def apply(value: UnitSource): Source = value.asInstanceOf[Source]
}

