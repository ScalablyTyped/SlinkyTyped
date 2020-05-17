package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ClassDeclaration
  - typingsSlinky.estree.mod.ClassExpression
*/
trait Class extends Node

object Class {
  @scala.inline
  implicit def apply(value: ClassDeclaration): Class = value.asInstanceOf[Class]
  @scala.inline
  implicit def apply(value: ClassExpression): Class = value.asInstanceOf[Class]
}

