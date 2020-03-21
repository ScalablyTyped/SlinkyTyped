package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsLeftLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var right: IdentifierKind | TSQualifiedNameKind
}

object AnonCommentsLeftLoc {
  @scala.inline
  def apply(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsLeftLoc = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsLeftLoc]
  }
}

