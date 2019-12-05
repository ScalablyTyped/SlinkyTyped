package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ExportSpecifier extends ASTNode {
  var exported: IdentifierKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(exported: IdentifierKind, `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ExportSpecifier): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier]
  }
}

