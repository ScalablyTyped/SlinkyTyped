package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsExtendsId
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.InterfaceExtendsKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  def from(params: Anon_BodyCommentsExtendsId): InterfaceDeclaration = js.native
}

