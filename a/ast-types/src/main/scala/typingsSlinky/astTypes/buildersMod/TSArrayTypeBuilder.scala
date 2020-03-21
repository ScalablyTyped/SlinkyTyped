package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsElementType
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSArrayTypeBuilder extends js.Object {
  def apply(elementType: TSTypeKind): TSArrayType = js.native
  def from(params: AnonCommentsElementType): TSArrayType = js.native
}

