package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> */
trait TSTypeParameter extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var constraint: js.UndefOr[TSTypeKind] = js.undefined
  var default: js.UndefOr[TSTypeKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: String
  var optional: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
}

object TSTypeParameter {
  @scala.inline
  def apply(
    name: String,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter,
    comments: js.Array[CommentKind] = null,
    constraint: TSTypeKind = null,
    default: TSTypeKind = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter]
  }
}

