package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatementBuilder extends js.Object {
  def apply(): BreakStatement = js.native
  def apply(label: IdentifierKind): BreakStatement = js.native
  def from(params: CommentsLabel): BreakStatement = js.native
}

