package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocParameters
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexSignatureBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def apply(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  def from(params: LocParameters): TSIndexSignature = js.native
}

