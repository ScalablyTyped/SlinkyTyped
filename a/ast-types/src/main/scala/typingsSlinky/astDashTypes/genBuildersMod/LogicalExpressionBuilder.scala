package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLeftLoc
import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandAmpersand
import typingsSlinky.astDashTypes.astDashTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineVerticalline
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpressionBuilder extends js.Object {
  def apply(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def from(params: Anon_CommentsLeftLoc): LogicalExpression = js.native
}

