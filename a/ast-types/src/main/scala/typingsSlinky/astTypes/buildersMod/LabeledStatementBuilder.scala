package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatementBuilder extends js.Object {
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def from(params: AnonLabel): LabeledStatement = js.native
}

