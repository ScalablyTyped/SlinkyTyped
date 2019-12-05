package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.TemplateElementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TemplateLiteral
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var expressions: js.Array[ExpressionKind]
  var quasis: js.Array[TemplateElementKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TemplateLiteral
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateLiteral")
@js.native
object TemplateLiteral extends TopLevel[Type[TemplateLiteral]]

