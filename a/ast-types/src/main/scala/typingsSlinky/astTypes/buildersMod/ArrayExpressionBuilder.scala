package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonElements
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def from(params: AnonElements): ArrayExpression = js.native
}

