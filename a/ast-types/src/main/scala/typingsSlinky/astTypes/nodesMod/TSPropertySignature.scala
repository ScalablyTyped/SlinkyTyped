package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeAnnotation */
trait TSPropertySignature extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var initializer: ExpressionKind | Null
  var key: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean
  var readonly: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSPropertySignature
  var typeAnnotation: TSTypeAnnotationKind | Null
}

object TSPropertySignature {
  @scala.inline
  def apply(
    computed: Boolean,
    key: ExpressionKind,
    optional: Boolean,
    readonly: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSPropertySignature,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature]
  }
}

