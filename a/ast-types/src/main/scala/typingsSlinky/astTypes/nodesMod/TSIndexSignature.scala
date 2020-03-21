package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeAnnotation */
trait TSIndexSignature extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var parameters: js.Array[IdentifierKind]
  var readonly: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexSignature
  var typeAnnotation: TSTypeAnnotationKind | Null
}

object TSIndexSignature {
  @scala.inline
  def apply(
    parameters: js.Array[IdentifierKind],
    readonly: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexSignature,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexSignature]
  }
}

