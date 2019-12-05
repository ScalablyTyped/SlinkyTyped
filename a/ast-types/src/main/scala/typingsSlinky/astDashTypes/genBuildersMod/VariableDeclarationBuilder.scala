package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsConst
import typingsSlinky.astDashTypes.astDashTypesStrings.`var`
import typingsSlinky.astDashTypes.astDashTypesStrings.const
import typingsSlinky.astDashTypes.astDashTypesStrings.let
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.VariableDeclaratorKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def from(params: Anon_CommentsConst): VariableDeclaration = js.native
}

