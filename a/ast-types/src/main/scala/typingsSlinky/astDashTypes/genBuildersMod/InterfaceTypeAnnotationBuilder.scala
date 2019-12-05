package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsExtends
import typingsSlinky.astDashTypes.genKindsMod.InterfaceExtendsKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeAnnotationBuilder extends js.Object {
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def from(params: Anon_BodyCommentsExtends): InterfaceTypeAnnotation = js.native
}

