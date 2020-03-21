package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonArgument
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnStatementBuilder extends js.Object {
  def apply(): ReturnStatement = js.native
  def apply(argument: ExpressionKind): ReturnStatement = js.native
  def from(params: AnonArgument): ReturnStatement = js.native
}

