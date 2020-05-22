package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guard extends js.Object {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var param: js.UndefOr[PatternKind | Null] = js.undefined
}

object Guard {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    guard: js.UndefOr[Null | ExpressionKind] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    param: js.UndefOr[Null | PatternKind] = js.undefined
  ): Guard = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(guard)) __obj.updateDynamic("guard")(guard.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(param)) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guard]
  }
}

