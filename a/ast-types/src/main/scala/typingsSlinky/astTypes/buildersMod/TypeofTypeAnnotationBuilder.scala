package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ArgumentFlowTypeKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTypeAnnotationBuilder extends js.Object {
  def apply(argument: FlowTypeKind): TypeofTypeAnnotation = js.native
  def from(params: ArgumentFlowTypeKind): TypeofTypeAnnotation = js.native
}

