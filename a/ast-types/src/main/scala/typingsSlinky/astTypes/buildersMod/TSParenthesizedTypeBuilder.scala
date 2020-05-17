package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.TypeAnnotationTSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSParenthesizedTypeBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind): TSParenthesizedType = js.native
  def from(params: TypeAnnotationTSTypeKind): TSParenthesizedType = js.native
}

