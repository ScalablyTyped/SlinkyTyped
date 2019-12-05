package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.FunctionTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeCallProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectTypeCallProperty
  var value: FunctionTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeCallProperty")
@js.native
object ObjectTypeCallProperty extends TopLevel[Type[ObjectTypeCallProperty]]

