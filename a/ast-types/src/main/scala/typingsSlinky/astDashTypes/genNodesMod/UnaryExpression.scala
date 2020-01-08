package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.Exclamationmark
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Tilde
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.delete
import typingsSlinky.astDashTypes.astDashTypesStrings.typeof
import typingsSlinky.astDashTypes.astDashTypesStrings.void
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait UnaryExpression extends ASTNode {
  var argument: ExpressionKind
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: Boolean
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

