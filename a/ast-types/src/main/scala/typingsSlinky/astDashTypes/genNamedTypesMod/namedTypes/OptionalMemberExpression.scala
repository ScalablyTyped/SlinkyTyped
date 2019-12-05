package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression[P]} */ trait OptionalMemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.OptionalMemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalMemberExpression")
@js.native
object OptionalMemberExpression extends TopLevel[Type[OptionalMemberExpression]]

