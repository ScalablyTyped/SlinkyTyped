package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsElementType
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSArrayTypeBuilder extends js.Object {
  def apply(elementType: TSTypeKind): TSArrayType = js.native
  def from(params: CommentsElementType): TSArrayType = js.native
}

