package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandAmpersand
import typingsSlinky.astDashTypes.astDashTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineVerticalline
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait LogicalExpression extends ASTNode {
  var left: ExpressionKind
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.LogicalExpression
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

