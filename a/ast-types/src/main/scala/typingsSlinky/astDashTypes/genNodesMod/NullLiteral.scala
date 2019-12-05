package typingsSlinky.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait NullLiteral extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.NullLiteral
  var value: Null
}

object NullLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.astDashTypes.astDashTypesStrings.NullLiteral, value: Null): NullLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

