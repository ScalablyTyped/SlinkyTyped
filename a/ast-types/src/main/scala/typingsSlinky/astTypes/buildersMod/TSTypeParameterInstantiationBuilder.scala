package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonParamsArray
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  def from(params: AnonParamsArray): TSTypeParameterInstantiation = js.native
}

