package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLeft
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForInStatementBuilder extends js.Object {
  def apply(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def from(params: AnonLeft): ForInStatement = js.native
}

