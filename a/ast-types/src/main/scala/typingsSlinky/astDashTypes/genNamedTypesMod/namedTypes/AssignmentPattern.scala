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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait AssignmentPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var left: PatternKind
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentPattern")
@js.native
object AssignmentPattern extends TopLevel[Type[AssignmentPattern]]

