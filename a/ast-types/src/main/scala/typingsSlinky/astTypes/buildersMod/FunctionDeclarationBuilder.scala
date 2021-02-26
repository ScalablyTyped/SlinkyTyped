package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Async
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDeclarationBuilder extends StObject {
  
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def apply(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionDeclaration = js.native
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def apply(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionDeclaration = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  
  def from(params: Async): FunctionDeclaration = js.native
}
