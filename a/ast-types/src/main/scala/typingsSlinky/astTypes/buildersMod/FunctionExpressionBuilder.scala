package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Defaults
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExpressionBuilder extends js.Object {
  def apply(id: js.UndefOr[IdentifierKind | Null], params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[IdentifierKind | Null],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[IdentifierKind | Null],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def from(params: Defaults): FunctionExpression = js.native
}

