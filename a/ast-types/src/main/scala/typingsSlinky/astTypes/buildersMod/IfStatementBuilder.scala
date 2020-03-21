package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAlternate
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, consequent: StatementKind): IfStatement = js.native
  def apply(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement = js.native
  def from(params: AnonAlternate): IfStatement = js.native
}

