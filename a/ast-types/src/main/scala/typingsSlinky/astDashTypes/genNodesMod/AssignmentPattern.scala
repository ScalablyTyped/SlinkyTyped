package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait AssignmentPattern extends ASTNode {
  var left: PatternKind
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentPattern
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern]
  }
}

