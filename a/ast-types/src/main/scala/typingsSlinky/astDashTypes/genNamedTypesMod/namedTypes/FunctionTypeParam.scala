package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait FunctionTypeParam
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: IdentifierKind
  var optional: Boolean
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.FunctionTypeParam
  var typeAnnotation: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.FunctionTypeParam")
@js.native
object FunctionTypeParam extends TopLevel[Type[FunctionTypeParam]]

