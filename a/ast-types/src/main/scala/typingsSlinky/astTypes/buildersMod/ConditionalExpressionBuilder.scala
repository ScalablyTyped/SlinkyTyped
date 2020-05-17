package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.AlternateComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpressionBuilder extends js.Object {
  def apply(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  def from(params: AlternateComments): ConditionalExpression = js.native
}

