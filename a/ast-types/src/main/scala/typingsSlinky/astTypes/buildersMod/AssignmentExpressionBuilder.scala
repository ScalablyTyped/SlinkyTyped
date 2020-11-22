package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLeft
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  
  def apply(operator: AmpersandEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: AmpersandEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: AsteriskAsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: AsteriskAsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: AsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: AsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: Equalssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: Equalssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(
    operator: GreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(operator: GreaterthansignGreaterthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(operator: LessthansignLessthansignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: LessthansignLessthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: PercentsignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: PercentsignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: PlussignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: PlussignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: SlashEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: SlashEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: VerticallineEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: VerticallineEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: `-Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: `-Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: `^Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def apply(operator: `^Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  
  def from(params: CommentsLeft): AssignmentExpression = js.native
}
