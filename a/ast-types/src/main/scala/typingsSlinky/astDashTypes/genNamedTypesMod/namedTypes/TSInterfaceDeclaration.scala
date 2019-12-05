package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.DeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.genKindsMod.TSExpressionWithTypeArgumentsKind
import typingsSlinky.astDashTypes.genKindsMod.TSHasOptionalTypeParametersKind
import typingsSlinky.astDashTypes.genKindsMod.TSInterfaceBodyKind
import typingsSlinky.astDashTypes.genKindsMod.TSQualifiedNameKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSInterfaceDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  var body: TSInterfaceBodyKind
  var declare: js.UndefOr[Boolean] = js.undefined
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.undefined
  var id: IdentifierKind | TSQualifiedNameKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSInterfaceDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSInterfaceDeclaration")
@js.native
object TSInterfaceDeclaration extends TopLevel[Type[TSInterfaceDeclaration]]

