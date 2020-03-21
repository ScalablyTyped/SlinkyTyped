package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonParameters
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCallSignatureDeclarationBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSCallSignatureDeclaration = js.native
  def apply(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSCallSignatureDeclaration = js.native
  def from(params: AnonParameters): TSCallSignatureDeclaration = js.native
}

