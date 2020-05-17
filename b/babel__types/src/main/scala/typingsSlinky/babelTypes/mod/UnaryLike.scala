package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.UnaryExpression_
  - typingsSlinky.babelTypes.mod.SpreadElement_
*/
trait UnaryLike extends Node

object UnaryLike {
  @scala.inline
  implicit def apply(value: SpreadElement_): UnaryLike = value.asInstanceOf[UnaryLike]
  @scala.inline
  implicit def apply(value: UnaryExpression_): UnaryLike = value.asInstanceOf[UnaryLike]
}

