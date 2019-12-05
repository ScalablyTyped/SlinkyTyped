package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_
import typingsSlinky.astDashTypes.astDashTypesStrings.`!`
import typingsSlinky.astDashTypes.astDashTypesStrings.`+`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-`
import typingsSlinky.astDashTypes.astDashTypesStrings.`~`
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
  def apply(operator: `!`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `!`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `+`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `+`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `-`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `~`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `~`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def from(params: Anon_): UnaryExpression = js.native
}

