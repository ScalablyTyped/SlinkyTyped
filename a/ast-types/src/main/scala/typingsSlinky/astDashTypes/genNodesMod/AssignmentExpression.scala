package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Equalssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PercentsignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PlussignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.SlashEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.`-Equalssign`
import typingsSlinky.astDashTypes.astDashTypesStrings.`^Equalssign`
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AssignmentExpression extends ASTNode {
  var left: PatternKind | MemberExpressionKind
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

