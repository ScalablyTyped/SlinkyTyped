package typingsSlinky.clownface.mod

import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.clownface.mod.TermOrClownface[X]
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait TermOrLiteral[X /* <: Term */] extends js.Object

object TermOrLiteral {
  @scala.inline
  implicit def apply[X](value: Boolean): TermOrLiteral[X] = value.asInstanceOf[TermOrLiteral[X]]
  @scala.inline
  implicit def apply[X](value: Double): TermOrLiteral[X] = value.asInstanceOf[TermOrLiteral[X]]
  @scala.inline
  implicit def apply[X](value: String): TermOrLiteral[X] = value.asInstanceOf[TermOrLiteral[X]]
  @scala.inline
  implicit def apply[X](value: TermOrClownface[X]): TermOrLiteral[X] = value.asInstanceOf[TermOrLiteral[X]]
}

