package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
*/
trait FlowPredicateKind extends js.Object

object FlowPredicateKind {
  @scala.inline
  implicit def apply(value: DeclaredPredicate): FlowPredicateKind = value.asInstanceOf[FlowPredicateKind]
  @scala.inline
  implicit def apply(value: InferredPredicate): FlowPredicateKind = value.asInstanceOf[FlowPredicateKind]
}

