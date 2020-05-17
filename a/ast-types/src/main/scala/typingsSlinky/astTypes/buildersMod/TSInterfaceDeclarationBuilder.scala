package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.DeclareExtends
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSInterfaceBodyKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def from(params: DeclareExtends): TSInterfaceDeclaration = js.native
}

