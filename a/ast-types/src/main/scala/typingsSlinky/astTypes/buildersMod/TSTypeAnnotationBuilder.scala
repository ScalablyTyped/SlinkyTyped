package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsLocTypeAnnotation
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def apply(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypeAnnotation): TSTypeAnnotation = js.native
}

