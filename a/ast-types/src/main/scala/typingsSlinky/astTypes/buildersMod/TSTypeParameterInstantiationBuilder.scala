package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ParamsArray
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  def from(params: ParamsArray): TSTypeParameterInstantiation = js.native
}

