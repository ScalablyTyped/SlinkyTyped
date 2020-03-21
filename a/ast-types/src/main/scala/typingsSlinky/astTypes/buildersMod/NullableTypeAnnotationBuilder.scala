package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocTypeAnnotation
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): NullableTypeAnnotation = js.native
  def from(params: AnonLocTypeAnnotation): NullableTypeAnnotation = js.native
}

