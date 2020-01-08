package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Equalssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PercentsignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PlussignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.SlashEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.`-Equalssign`
import typingsSlinky.astDashTypes.astDashTypesStrings.`^Equalssign`
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AssignmentExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: PatternKind | MemberExpressionKind
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
@js.native
object AssignmentExpression extends TopLevel[Type[AssignmentExpression]]

