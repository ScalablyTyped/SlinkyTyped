package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocValue
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclaredPredicateBuilder extends js.Object {
  def apply(value: ExpressionKind): DeclaredPredicate = js.native
  def from(params: AnonLocValue): DeclaredPredicate = js.native
}

