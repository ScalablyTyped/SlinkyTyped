package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.CallExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression[P]} */ trait OptionalCallExpression
  extends ASTNode
     with CallExpressionKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.OptionalCallExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalCallExpression")
@js.native
object OptionalCallExpression extends TopLevel[Type[OptionalCallExpression]]

