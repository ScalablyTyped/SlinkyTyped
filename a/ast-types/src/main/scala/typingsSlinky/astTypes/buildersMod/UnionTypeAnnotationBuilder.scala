package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypes
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  def from(params: AnonTypes): UnionTypeAnnotation = js.native
}

