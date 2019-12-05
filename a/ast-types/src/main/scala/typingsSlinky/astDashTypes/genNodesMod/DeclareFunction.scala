package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareFunction extends ASTNode {
  var id: IdentifierKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareFunction
}

object DeclareFunction {
  @scala.inline
  def apply(id: IdentifierKind, `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareFunction): DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareFunction]
  }
}

