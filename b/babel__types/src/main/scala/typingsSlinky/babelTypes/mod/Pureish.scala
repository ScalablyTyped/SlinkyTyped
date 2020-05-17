package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.FunctionExpression_
  - typingsSlinky.babelTypes.mod.StringLiteral_
  - typingsSlinky.babelTypes.mod.NumericLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.RegExpLiteral_
  - typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
  - typingsSlinky.babelTypes.mod.BigIntLiteral_
*/
trait Pureish extends Node

object Pureish {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: BigIntLiteral_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: BooleanLiteral_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: FunctionDeclaration_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: FunctionExpression_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: NullLiteral_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: NumericLiteral_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: RegExpLiteral_): Pureish = value.asInstanceOf[Pureish]
  @scala.inline
  implicit def apply(value: StringLiteral_): Pureish = value.asInstanceOf[Pureish]
}

