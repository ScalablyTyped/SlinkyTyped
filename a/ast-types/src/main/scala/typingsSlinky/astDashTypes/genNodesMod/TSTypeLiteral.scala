package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSIndexSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSMethodSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSPropertySignatureKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeLiteral extends ASTNode {
  var members: js.Array[
    TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSTypeLiteral
}

object TSTypeLiteral {
  @scala.inline
  def apply(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSTypeLiteral
  ): TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeLiteral]
  }
}

