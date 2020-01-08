package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandAmpersand
import typingsSlinky.astDashTypes.astDashTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineVerticalline
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait LogicalExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: ExpressionKind
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.LogicalExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.LogicalExpression")
@js.native
object LogicalExpression extends TopLevel[Type[LogicalExpression]]

