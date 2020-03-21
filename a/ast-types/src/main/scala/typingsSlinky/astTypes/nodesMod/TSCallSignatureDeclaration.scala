package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeParameters */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeAnnotation */
trait TSCallSignatureDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSCallSignatureDeclaration
  var typeAnnotation: TSTypeAnnotationKind | Null
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSCallSignatureDeclaration {
  @scala.inline
  def apply(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSCallSignatureDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSCallSignatureDeclaration]
  }
}

