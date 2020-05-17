package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatementBuilder extends js.Object {
  def apply(): ContinueStatement = js.native
  def apply(label: IdentifierKind): ContinueStatement = js.native
  def from(params: CommentsLabel): ContinueStatement = js.native
}

