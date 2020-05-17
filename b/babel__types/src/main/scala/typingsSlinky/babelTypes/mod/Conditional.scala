package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ConditionalExpression_
  - typingsSlinky.babelTypes.mod.IfStatement_
*/
trait Conditional extends Node

object Conditional {
  @scala.inline
  implicit def apply(value: ConditionalExpression_): Conditional = value.asInstanceOf[Conditional]
  @scala.inline
  implicit def apply(value: IfStatement_): Conditional = value.asInstanceOf[Conditional]
}

