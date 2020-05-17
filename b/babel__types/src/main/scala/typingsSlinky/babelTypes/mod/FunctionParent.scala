package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.FunctionExpression_
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
  - typingsSlinky.babelTypes.mod.ClassMethod_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
*/
trait FunctionParent extends Node

object FunctionParent {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression_): FunctionParent = value.asInstanceOf[FunctionParent]
  @scala.inline
  implicit def apply(value: ClassMethod_): FunctionParent = value.asInstanceOf[FunctionParent]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod_): FunctionParent = value.asInstanceOf[FunctionParent]
  @scala.inline
  implicit def apply(value: FunctionDeclaration_): FunctionParent = value.asInstanceOf[FunctionParent]
  @scala.inline
  implicit def apply(value: FunctionExpression_): FunctionParent = value.asInstanceOf[FunctionParent]
  @scala.inline
  implicit def apply(value: ObjectMethod_): FunctionParent = value.asInstanceOf[FunctionParent]
}

