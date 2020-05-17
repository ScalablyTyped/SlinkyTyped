package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): ParenthesizedExpression = js.native
  def from(params: Expression): ParenthesizedExpression = js.native
}

