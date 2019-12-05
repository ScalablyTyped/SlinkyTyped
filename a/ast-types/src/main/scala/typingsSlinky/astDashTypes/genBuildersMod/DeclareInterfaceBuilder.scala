package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsExtendsId
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.InterfaceExtendsKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareInterfaceBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  def from(params: Anon_BodyCommentsExtendsId): DeclareInterface = js.native
}

