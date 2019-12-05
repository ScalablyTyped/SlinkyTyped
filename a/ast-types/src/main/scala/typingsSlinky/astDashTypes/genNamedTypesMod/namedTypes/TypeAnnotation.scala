package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeAnnotation
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TypeAnnotation
  var typeAnnotation: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeAnnotation")
@js.native
object TypeAnnotation extends TopLevel[Type[TypeAnnotation]]

