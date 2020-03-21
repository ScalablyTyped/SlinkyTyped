package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypeAnnotationTSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSOptionalTypeBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind): TSOptionalType = js.native
  def from(params: AnonTypeAnnotationTSTypeKind): TSOptionalType = js.native
}

