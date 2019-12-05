package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait VariableDeclarator
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var id: PatternKind
  var init: js.UndefOr[ExpressionKind | Null] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.VariableDeclarator
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.VariableDeclarator")
@js.native
object VariableDeclarator extends TopLevel[Type[VariableDeclarator]]

