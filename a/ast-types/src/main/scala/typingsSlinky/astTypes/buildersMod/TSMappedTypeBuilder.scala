package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonReadonly
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMappedTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  def from(params: AnonReadonly): TSMappedType = js.native
}

