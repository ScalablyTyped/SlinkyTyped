package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonExpressions
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceExpressionBuilder extends js.Object {
  def apply(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  def from(params: AnonExpressions): SequenceExpression = js.native
}

