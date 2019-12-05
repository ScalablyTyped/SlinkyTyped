package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait DoExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var body: js.Array[StatementKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DoExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DoExpression")
@js.native
object DoExpression extends TopLevel[Type[DoExpression]]

