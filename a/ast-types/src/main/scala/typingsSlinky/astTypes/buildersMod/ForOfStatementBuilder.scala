package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonBodyComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForOfStatementBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def from(params: AnonBodyComments): ForOfStatement = js.native
}

