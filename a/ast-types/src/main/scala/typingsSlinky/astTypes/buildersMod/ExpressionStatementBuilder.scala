package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatementBuilder extends js.Object {
  def apply(expression: ExpressionKind): ExpressionStatement = js.native
  def from(params: Expression): ExpressionStatement = js.native
}

