package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.DeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.InterfaceDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration[P]} */ trait DeclareClass
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareClass
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareClass")
@js.native
object DeclareClass extends TopLevel[Type[DeclareClass]]

