package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAsync
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def from(params: AnonAsync): FunctionDeclaration = js.native
}

