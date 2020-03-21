package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypes
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  def from(params: AnonTypes): TupleTypeAnnotation = js.native
}

