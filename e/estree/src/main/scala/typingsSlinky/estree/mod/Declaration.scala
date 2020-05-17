package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.FunctionDeclaration
  - typingsSlinky.estree.mod.VariableDeclaration
  - typingsSlinky.estree.mod.ClassDeclaration
*/
trait Declaration extends Statement

object Declaration {
  @scala.inline
  implicit def apply(value: ClassDeclaration): Declaration = value.asInstanceOf[Declaration]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): Declaration = value.asInstanceOf[Declaration]
  @scala.inline
  implicit def apply(value: VariableDeclaration): Declaration = value.asInstanceOf[Declaration]
}

