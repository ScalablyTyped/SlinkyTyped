package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Declarations
import typingsSlinky.astTypes.astTypesStrings.`var`
import typingsSlinky.astTypes.astTypesStrings.const
import typingsSlinky.astTypes.astTypesStrings.let
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def from(params: Declarations): VariableDeclaration = js.native
}

