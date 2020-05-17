package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BinaryExpression_
  - typingsSlinky.babelTypes.mod.LogicalExpression_
*/
trait Binary extends Node

object Binary {
  @scala.inline
  implicit def apply(value: BinaryExpression_): Binary = value.asInstanceOf[Binary]
  @scala.inline
  implicit def apply(value: LogicalExpression_): Binary = value.asInstanceOf[Binary]
}

