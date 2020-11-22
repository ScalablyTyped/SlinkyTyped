package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Right
import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Greaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.Lessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansign
import typingsSlinky.astTypes.astTypesStrings.Percentsign
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Slash
import typingsSlinky.astTypes.astTypesStrings.Verticalline
import typingsSlinky.astTypes.astTypesStrings.^
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.in
import typingsSlinky.astTypes.astTypesStrings.instanceof
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryExpressionBuilder extends js.Object {
  
  def apply(operator: Ampersand, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: AsteriskAsterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Asterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: EqualssignEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: EqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: ExclamationmarkEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: ExclamationmarkEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: GreaterthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(
    operator: GreaterthansignGreaterthansignGreaterthansign,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def apply(operator: GreaterthansignGreaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Greaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: LessthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: LessthansignLessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Lessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Percentsign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Plussign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Slash, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: Verticalline, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: ^, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: `-_`, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: in, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def apply(operator: instanceof, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  
  def from(params: Right): BinaryExpression = js.native
}
