package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MetaProperty
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var meta: IdentifierKind
  var property: IdentifierKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.MetaProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.MetaProperty")
@js.native
object MetaProperty extends TopLevel[Type[MetaProperty]]

