package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait BreakStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var label: js.UndefOr[IdentifierKind | Null] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BreakStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BreakStatement")
@js.native
object BreakStatement extends TopLevel[Type[BreakStatement]]

