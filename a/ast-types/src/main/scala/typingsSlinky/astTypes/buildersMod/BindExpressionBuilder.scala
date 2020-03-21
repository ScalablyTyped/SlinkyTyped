package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCallee
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindExpressionBuilder extends js.Object {
  def apply(`object`: Null, callee: ExpressionKind): BindExpression = js.native
  def apply(`object`: ExpressionKind, callee: ExpressionKind): BindExpression = js.native
  def from(params: AnonCallee): BindExpression = js.native
}

