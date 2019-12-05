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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait EmptyStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.EmptyStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.EmptyStatement")
@js.native
object EmptyStatement extends TopLevel[Type[EmptyStatement]]

