package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsId
import typingsSlinky.astDashTypes.genKindsMod.ClassBodyKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassDeclarationBuilder extends js.Object {
  def apply(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def from(params: Anon_BodyCommentsId): ClassDeclaration = js.native
}

