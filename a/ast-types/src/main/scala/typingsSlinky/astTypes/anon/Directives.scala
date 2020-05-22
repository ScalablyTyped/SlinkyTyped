package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DirectiveKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directives extends js.Object {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Directives {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    directives: js.Array[DirectiveKind] = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Directives = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
}

