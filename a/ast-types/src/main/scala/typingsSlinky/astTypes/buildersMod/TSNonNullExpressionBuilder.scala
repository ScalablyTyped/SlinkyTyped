package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSNonNullExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): TSNonNullExpression = js.native
  def from(params: Expression): TSNonNullExpression = js.native
}

