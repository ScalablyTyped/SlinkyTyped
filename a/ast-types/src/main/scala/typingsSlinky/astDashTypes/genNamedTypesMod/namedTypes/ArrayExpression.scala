package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.RestElementKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrayExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ArrayExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrayExpression")
@js.native
object ArrayExpression extends TopLevel[Type[ArrayExpression]]

