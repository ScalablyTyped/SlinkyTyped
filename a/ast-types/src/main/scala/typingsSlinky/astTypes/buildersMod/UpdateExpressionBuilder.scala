package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Prefix
import typingsSlinky.astTypes.astTypesStrings.PlussignPlussign
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpressionBuilder extends js.Object {
  def apply(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def from(params: Prefix): UpdateExpression = js.native
}

