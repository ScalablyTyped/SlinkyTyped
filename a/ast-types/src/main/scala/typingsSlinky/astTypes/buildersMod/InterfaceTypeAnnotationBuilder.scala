package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonExtends
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeAnnotationBuilder extends js.Object {
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def from(params: AnonExtends): InterfaceTypeAnnotation = js.native
}

