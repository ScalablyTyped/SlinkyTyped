package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Guard
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClauseBuilder extends js.Object {
  def apply(
    param: js.UndefOr[Null | PatternKind],
    guard: js.UndefOr[ExpressionKind | Null],
    body: BlockStatementKind
  ): CatchClause = js.native
  def from(params: Guard): CatchClause = js.native
}

