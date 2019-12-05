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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ThrowStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var argument: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ThrowStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ThrowStatement")
@js.native
object ThrowStatement extends TopLevel[Type[ThrowStatement]]

