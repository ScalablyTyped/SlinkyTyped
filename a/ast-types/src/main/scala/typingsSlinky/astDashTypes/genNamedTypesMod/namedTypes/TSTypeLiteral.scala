package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSIndexSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSMethodSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSPropertySignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeLiteral
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var members: js.Array[
    TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSTypeLiteral
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeLiteral")
@js.native
object TSTypeLiteral extends TopLevel[Type[TSTypeLiteral]]

