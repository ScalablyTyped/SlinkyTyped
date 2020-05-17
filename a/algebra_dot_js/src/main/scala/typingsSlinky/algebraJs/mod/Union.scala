package typingsSlinky.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.algebraJs.mod.algebra.js_.Fraction
  - typingsSlinky.algebraJs.mod.Term
*/
trait Union extends js.Object

object Union {
  @scala.inline
  implicit def apply(value: Double): Union = value.asInstanceOf[Union]
  @scala.inline
  implicit def apply(value: typingsSlinky.algebraJs.mod.algebra.js_.Fraction): Union = value.asInstanceOf[Union]
  @scala.inline
  implicit def apply(value: String): Union = value.asInstanceOf[Union]
  @scala.inline
  implicit def apply(value: Term): Union = value.asInstanceOf[Union]
}

