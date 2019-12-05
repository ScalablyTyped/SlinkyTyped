package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import typingsSlinky.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait NewExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.NewExpression
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.NewExpression")
@js.native
object NewExpression extends TopLevel[Type[NewExpression]]

