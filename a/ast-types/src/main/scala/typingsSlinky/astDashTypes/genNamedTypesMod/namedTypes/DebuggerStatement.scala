package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DebuggerStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DebuggerStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DebuggerStatement")
@js.native
object DebuggerStatement extends TopLevel[Type[DebuggerStatement]]

