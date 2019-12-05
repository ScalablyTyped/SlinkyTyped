package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ImportSpecifier extends ASTNode {
  var imported: IdentifierKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(imported: IdentifierKind, `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ImportSpecifier): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
}

