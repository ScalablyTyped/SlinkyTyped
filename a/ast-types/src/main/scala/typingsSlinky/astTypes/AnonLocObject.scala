package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocObject extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var `object`: IdentifierKind
  var property: MemberTypeAnnotationKind | GenericTypeAnnotationKind
}

object AnonLocObject {
  @scala.inline
  def apply(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonLocObject = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocObject]
  }
}

