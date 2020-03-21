package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonArgumentComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowStatementBuilder extends js.Object {
  def apply(argument: ExpressionKind): ThrowStatement = js.native
  def from(params: AnonArgumentComments): ThrowStatement = js.native
}

