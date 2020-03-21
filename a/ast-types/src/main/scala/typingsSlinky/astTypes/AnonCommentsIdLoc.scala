package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsIdLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsIdLoc {
  @scala.inline
  def apply(id: IdentifierKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonCommentsIdLoc = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsIdLoc]
  }
}

