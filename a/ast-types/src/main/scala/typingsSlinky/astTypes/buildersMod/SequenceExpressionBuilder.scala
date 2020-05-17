package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expressions
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceExpressionBuilder extends js.Object {
  def apply(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  def from(params: Expressions): SequenceExpression = js.native
}

