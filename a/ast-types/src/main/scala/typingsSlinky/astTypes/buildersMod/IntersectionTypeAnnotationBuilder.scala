package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypes
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  def from(params: AnonTypes): IntersectionTypeAnnotation = js.native
}

