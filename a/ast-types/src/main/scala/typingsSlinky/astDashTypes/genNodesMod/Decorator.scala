package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Decorator extends ASTNode {
  var expression: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Decorator
}

object Decorator {
  @scala.inline
  def apply(expression: ExpressionKind, `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Decorator): Decorator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
}

