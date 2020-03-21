package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonDelegate
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YieldExpressionBuilder extends js.Object {
  def apply(): YieldExpression = js.native
  def apply(argument: Null, delegate: Boolean): YieldExpression = js.native
  def apply(argument: ExpressionKind): YieldExpression = js.native
  def apply(argument: ExpressionKind, delegate: Boolean): YieldExpression = js.native
  def from(params: AnonDelegate): YieldExpression = js.native
}

