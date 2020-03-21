package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonObject
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStatementBuilder extends js.Object {
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  def from(params: AnonObject): WithStatement = js.native
}

