package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsLocParams
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[FlowTypeKind]): TypeParameterInstantiation = js.native
  def from(params: AnonCommentsLocParams): TypeParameterInstantiation = js.native
}

