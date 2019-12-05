package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait BreakStatement extends ASTNode {
  var label: IdentifierKind | Null
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BreakStatement,
    label: IdentifierKind = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement]
  }
}

