package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonOperator
import typingsSlinky.astTypes.astTypesStrings.Exclamationmark
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Tilde
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.delete
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpressionBuilder extends js.Object {
  def apply(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def from(params: AnonOperator): UnaryExpression = js.native
}

