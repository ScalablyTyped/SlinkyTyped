package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocTypeAnnotation
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  def from(params: AnonLocTypeAnnotation): TypeAnnotation = js.native
}

