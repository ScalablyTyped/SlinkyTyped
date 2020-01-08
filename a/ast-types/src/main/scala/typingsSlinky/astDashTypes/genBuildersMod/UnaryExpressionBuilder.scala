package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_
import typingsSlinky.astDashTypes.astDashTypesStrings.Exclamationmark
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Tilde
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.delete
import typingsSlinky.astDashTypes.astDashTypesStrings.typeof
import typingsSlinky.astDashTypes.astDashTypesStrings.void
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
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
  def from(params: Anon_): UnaryExpression = js.native
}

