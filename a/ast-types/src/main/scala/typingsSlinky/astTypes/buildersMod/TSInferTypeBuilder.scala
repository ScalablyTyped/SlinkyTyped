package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypeParameter
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInferTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSInferType = js.native
  def from(params: AnonTypeParameter): TSInferType = js.native
}

