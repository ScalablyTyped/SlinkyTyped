package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.UnaryExpression_
  - typingsSlinky.babelTypes.mod.SpreadElement_
  - typingsSlinky.babelTypes.mod.RestProperty_
  - typingsSlinky.babelTypes.mod.SpreadProperty_
*/
trait UnaryLike extends js.Object

object UnaryLike {
  @scala.inline
  implicit def apply(value: RestProperty_): UnaryLike = value.asInstanceOf[UnaryLike]
  @scala.inline
  implicit def apply(value: SpreadElement_): UnaryLike = value.asInstanceOf[UnaryLike]
  @scala.inline
  implicit def apply(value: SpreadProperty_): UnaryLike = value.asInstanceOf[UnaryLike]
  @scala.inline
  implicit def apply(value: UnaryExpression_): UnaryLike = value.asInstanceOf[UnaryLike]
}

