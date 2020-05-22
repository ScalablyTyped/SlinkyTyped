package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blocks extends js.Object {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var filter: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Blocks {
  @scala.inline
  def apply(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    filter: ExpressionKind = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Blocks = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blocks]
  }
}

