package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.`type`
import typingsSlinky.astDashTypes.astDashTypesStrings.value
import typingsSlinky.astDashTypes.genKindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astDashTypes.genKindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astDashTypes.genKindsMod.ImportSpecifierKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ImportDeclaration extends ASTNode {
  var importKind: value | `type`
  var source: LiteralKind
  var specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    importKind: value | `type`,
    source: LiteralKind,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ImportDeclaration
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(importKind = importKind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration]
  }
}

