package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.DeclaredPredicate_
  - typingsSlinky.babelTypes.mod.InferredPredicate_
*/
trait FlowPredicate extends Node

object FlowPredicate {
  @scala.inline
  implicit def apply(value: DeclaredPredicate_): FlowPredicate = value.asInstanceOf[FlowPredicate]
  @scala.inline
  implicit def apply(value: InferredPredicate_): FlowPredicate = value.asInstanceOf[FlowPredicate]
}

