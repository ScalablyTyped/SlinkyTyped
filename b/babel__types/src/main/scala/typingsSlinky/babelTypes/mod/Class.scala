package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ClassExpression_
  - typingsSlinky.babelTypes.mod.ClassDeclaration_
*/
trait Class extends Node

object Class {
  @scala.inline
  implicit def apply(value: ClassDeclaration_): Class = value.asInstanceOf[Class]
  @scala.inline
  implicit def apply(value: ClassExpression_): Class = value.asInstanceOf[Class]
}

