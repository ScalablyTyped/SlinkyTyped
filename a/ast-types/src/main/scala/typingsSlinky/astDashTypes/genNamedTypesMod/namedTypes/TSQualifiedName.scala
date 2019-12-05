package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.TSQualifiedNameKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSQualifiedName
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var left: IdentifierKind | TSQualifiedNameKind
  var right: IdentifierKind | TSQualifiedNameKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSQualifiedName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSQualifiedName")
@js.native
object TSQualifiedName extends TopLevel[Type[TSQualifiedName]]

