package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var label: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(
    body: StatementKind,
    label: IdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonLabel = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

