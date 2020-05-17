package typingsSlinky.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.StringLiteral
  - typingsSlinky.esquery.mod.NumericLiteral
*/
trait Literal extends js.Object

object Literal {
  @scala.inline
  implicit def apply(value: NumericLiteral): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: StringLiteral): Literal = value.asInstanceOf[Literal]
}

