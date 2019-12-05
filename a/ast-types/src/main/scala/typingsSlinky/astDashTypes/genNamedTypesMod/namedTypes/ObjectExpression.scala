package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.PropertyKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadPropertyKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ObjectExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var properties: js.Array[
    PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
  ]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectExpression")
@js.native
object ObjectExpression extends TopLevel[Type[ObjectExpression]]

