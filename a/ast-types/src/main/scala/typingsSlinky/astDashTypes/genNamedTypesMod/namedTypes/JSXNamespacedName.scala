package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.JSXIdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXNamespacedName
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: JSXIdentifierKind
  var namespace: JSXIdentifierKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXNamespacedName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXNamespacedName")
@js.native
object JSXNamespacedName extends TopLevel[Type[JSXNamespacedName]]

