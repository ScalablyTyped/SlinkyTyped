package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.StringLiteral_
  - typingsSlinky.babelTypes.mod.NumericLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.RegExpLiteral_
  - typingsSlinky.babelTypes.mod.TemplateLiteral_
  - typingsSlinky.babelTypes.mod.BigIntLiteral_
*/
trait Literal extends Node

object Literal {
  @scala.inline
  implicit def apply(value: BigIntLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: BooleanLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: NullLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: NumericLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: RegExpLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: StringLiteral_): Literal = value.asInstanceOf[Literal]
  @scala.inline
  implicit def apply(value: TemplateLiteral_): Literal = value.asInstanceOf[Literal]
}

