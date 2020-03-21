package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsExtends
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareInterfaceBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  def from(params: AnonCommentsExtends): DeclareInterface = js.native
}

