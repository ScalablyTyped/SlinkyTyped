package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonElementType
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTypeAnnotationBuilder extends js.Object {
  def apply(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  def from(params: AnonElementType): ArrayTypeAnnotation = js.native
}

