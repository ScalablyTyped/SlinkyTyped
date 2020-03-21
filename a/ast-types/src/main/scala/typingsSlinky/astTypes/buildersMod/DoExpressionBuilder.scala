package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonBodyArray
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoExpressionBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): DoExpression = js.native
  def from(params: AnonBodyArray): DoExpression = js.native
}

