package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeAnnotationTypeAnnotationKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeAnnotation: TypeAnnotationKind
}

object AnonTypeAnnotationTypeAnnotationKind {
  @scala.inline
  def apply(
    typeAnnotation: TypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonTypeAnnotationTypeAnnotationKind = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeAnnotationTypeAnnotationKind]
  }
}

