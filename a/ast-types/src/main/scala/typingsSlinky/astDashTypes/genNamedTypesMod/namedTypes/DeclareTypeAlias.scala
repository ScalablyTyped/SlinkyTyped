package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.DeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.genKindsMod.TypeAliasKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias[P]} */ trait DeclareTypeAlias
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TypeAliasKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareTypeAlias
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareTypeAlias")
@js.native
object DeclareTypeAlias extends TopLevel[Type[DeclareTypeAlias]]

