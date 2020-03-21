package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsDeclare
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAliasDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  def from(params: AnonCommentsDeclare): TSTypeAliasDeclaration = js.native
}

