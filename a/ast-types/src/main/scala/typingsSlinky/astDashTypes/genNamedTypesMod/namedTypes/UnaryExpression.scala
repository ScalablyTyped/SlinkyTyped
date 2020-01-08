package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.Exclamationmark
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Tilde
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.delete
import typingsSlinky.astDashTypes.astDashTypesStrings.typeof
import typingsSlinky.astDashTypes.astDashTypesStrings.void
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait UnaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.UnaryExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.UnaryExpression")
@js.native
object UnaryExpression extends TopLevel[Type[UnaryExpression]]

