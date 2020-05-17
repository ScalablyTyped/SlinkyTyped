package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.AssignmentPattern_
  - typingsSlinky.babelTypes.mod.ArrayPattern_
  - typingsSlinky.babelTypes.mod.ObjectPattern_
*/
trait Pattern extends Node

object Pattern {
  @scala.inline
  implicit def apply(value: ArrayPattern_): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: AssignmentPattern_): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: ObjectPattern_): Pattern = value.asInstanceOf[Pattern]
}

