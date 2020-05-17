package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.FunctionDeclaration
  - typingsSlinky.estree.mod.FunctionExpression
  - typingsSlinky.estree.mod.ArrowFunctionExpression
*/
trait Function extends Node

object Function {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: FunctionExpression): Function = value.asInstanceOf[Function]
}

