package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsExported extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exported: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsExported {
  @scala.inline
  def apply(exported: IdentifierKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonCommentsExported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsExported]
  }
}

