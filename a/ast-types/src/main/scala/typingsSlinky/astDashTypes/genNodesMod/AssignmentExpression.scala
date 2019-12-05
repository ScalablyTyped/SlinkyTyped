package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.`%=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`&=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`*=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`+=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`/=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<<=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`^=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`|=`
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AssignmentExpression extends ASTNode {
  var left: PatternKind | MemberExpressionKind
  var operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`,
    right: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

