package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.TypeArguments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalCallExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def apply(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def from(params: TypeArguments): OptionalCallExpression = js.native
}

