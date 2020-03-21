package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGuard extends js.Object {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var param: js.UndefOr[PatternKind | Null] = js.undefined
}

object AnonGuard {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    comments: js.Array[CommentKind] = null,
    guard: ExpressionKind = null,
    loc: SourceLocationKind = null,
    param: PatternKind = null
  ): AnonGuard = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (guard != null) __obj.updateDynamic("guard")(guard.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGuard]
  }
}

