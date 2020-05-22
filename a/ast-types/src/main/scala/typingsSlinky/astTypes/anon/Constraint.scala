package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var constraint: js.UndefOr[TSTypeKind] = js.undefined
  var default: js.UndefOr[TSTypeKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}

object Constraint {
  @scala.inline
  def apply(
    name: String,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    constraint: TSTypeKind = null,
    default: TSTypeKind = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: js.UndefOr[Null | TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  ): Constraint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(typeAnnotation)) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

