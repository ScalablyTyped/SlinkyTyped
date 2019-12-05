package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.Anon_Cooked
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TemplateElement
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var tail: Boolean
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TemplateElement
  var value: Anon_Cooked
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateElement")
@js.native
object TemplateElement extends TopLevel[Type[TemplateElement]]

