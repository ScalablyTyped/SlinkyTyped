package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommentsId extends js.Object {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | LiteralKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonBodyCommentsId {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonBodyCommentsId = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCommentsId]
  }
}

