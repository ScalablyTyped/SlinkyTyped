package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsLocValue extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var value: DirectiveLiteralKind
}

object AnonCommentsLocValue {
  @scala.inline
  def apply(
    value: DirectiveLiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsLocValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsLocValue]
  }
}

