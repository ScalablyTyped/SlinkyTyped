package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Init
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatementBuilder extends js.Object {
  def apply(init: Null, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def from(params: Init): ForStatement = js.native
}

