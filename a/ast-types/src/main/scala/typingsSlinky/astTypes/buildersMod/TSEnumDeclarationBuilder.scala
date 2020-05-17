package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Const
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSEnumMemberKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  def from(params: Const): TSEnumDeclaration = js.native
}

