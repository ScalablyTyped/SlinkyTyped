package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ======================================================================
  * Rax Nodes
  * ======================================================================
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait RaxText extends RaxChild

object RaxText {
  @scala.inline
  implicit def apply(value: Double): RaxText = value.asInstanceOf[RaxText]
  @scala.inline
  implicit def apply(value: String): RaxText = value.asInstanceOf[RaxText]
}

