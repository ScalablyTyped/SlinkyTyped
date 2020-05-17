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
*/
trait Function extends js.Object

object Function {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression_): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: ClassMethod_): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: FunctionDeclaration_): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: FunctionExpression_): Function = value.asInstanceOf[Function]
  @scala.inline
  implicit def apply(value: ObjectMethod_): Function = value.asInstanceOf[Function]
}

