package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Arguments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression = js.native
  def from(params: Arguments): NewExpression = js.native
}

