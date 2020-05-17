package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.ObjectPattern
  - typingsSlinky.estree.mod.ArrayPattern
  - typingsSlinky.estree.mod.RestElement
  - typingsSlinky.estree.mod.AssignmentPattern
  - typingsSlinky.estree.mod.MemberExpression
*/
trait Pattern extends Node

object Pattern {
  @scala.inline
  implicit def apply(value: ArrayPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: AssignmentPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: Identifier): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: MemberExpression): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: ObjectPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: RestElement): Pattern = value.asInstanceOf[Pattern]
}

