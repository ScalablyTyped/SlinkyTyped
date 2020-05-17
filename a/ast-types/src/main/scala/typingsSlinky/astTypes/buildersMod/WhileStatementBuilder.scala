package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Test
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhileStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  def from(params: Test): WhileStatement = js.native
}

