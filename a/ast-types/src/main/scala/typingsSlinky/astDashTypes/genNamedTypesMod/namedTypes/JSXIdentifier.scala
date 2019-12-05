package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Identifier[P]} */ trait JSXIdentifier
  extends ASTNode
     with ExpressionKind
     with IdentifierKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var name: String
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXIdentifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXIdentifier")
@js.native
object JSXIdentifier extends TopLevel[Type[JSXIdentifier]]

