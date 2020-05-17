package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLeft
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.AsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.Equalssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PercentsignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PlussignEqualssign
import typingsSlinky.astTypes.astTypesStrings.SlashEqualssign
import typingsSlinky.astTypes.astTypesStrings.VerticallineEqualssign
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
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
  def from(params: CommentsLeft): AssignmentExpression = js.native
}

