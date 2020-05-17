package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.RestElement_
  - typingsSlinky.babelTypes.mod.AssignmentPattern_
  - typingsSlinky.babelTypes.mod.ArrayPattern_
  - typingsSlinky.babelTypes.mod.ObjectPattern_
*/
trait PatternLike extends Node

object PatternLike {
  @scala.inline
  implicit def apply(value: ArrayPattern_): PatternLike = value.asInstanceOf[PatternLike]
  @scala.inline
  implicit def apply(value: AssignmentPattern_): PatternLike = value.asInstanceOf[PatternLike]
  @scala.inline
  implicit def apply(value: Identifier_): PatternLike = value.asInstanceOf[PatternLike]
  @scala.inline
  implicit def apply(value: ObjectPattern_): PatternLike = value.asInstanceOf[PatternLike]
  @scala.inline
  implicit def apply(value: RestElement_): PatternLike = value.asInstanceOf[PatternLike]
}

