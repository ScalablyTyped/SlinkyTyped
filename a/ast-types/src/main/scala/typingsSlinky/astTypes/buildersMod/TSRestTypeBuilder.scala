package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypeAnnotationTSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSRestTypeBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind): TSRestType = js.native
  def from(params: AnonTypeAnnotationTSTypeKind): TSRestType = js.native
}

