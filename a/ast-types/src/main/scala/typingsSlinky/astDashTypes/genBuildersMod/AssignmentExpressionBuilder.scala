package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLeft
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
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def from(params: Anon_CommentsLeft): AssignmentExpression = js.native
}

