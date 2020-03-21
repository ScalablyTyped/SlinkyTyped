package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonOptional
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParamBuilder extends js.Object {
  def apply(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def from(params: AnonOptional): FunctionTypeParam = js.native
}

