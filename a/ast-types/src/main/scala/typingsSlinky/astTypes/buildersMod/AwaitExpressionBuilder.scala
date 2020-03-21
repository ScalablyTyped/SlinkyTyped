package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAll
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwaitExpressionBuilder extends js.Object {
  def apply(): AwaitExpression = js.native
  def apply(argument: Null, all: Boolean): AwaitExpression = js.native
  def apply(argument: ExpressionKind): AwaitExpression = js.native
  def apply(argument: ExpressionKind, all: Boolean): AwaitExpression = js.native
  def from(params: AnonAll): AwaitExpression = js.native
}

