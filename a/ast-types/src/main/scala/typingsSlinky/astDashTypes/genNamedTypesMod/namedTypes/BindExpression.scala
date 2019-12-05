package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BindExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var callee: ExpressionKind
  var `object`: ExpressionKind | Null
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BindExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BindExpression")
@js.native
object BindExpression extends TopLevel[Type[BindExpression]]

