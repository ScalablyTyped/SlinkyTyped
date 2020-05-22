package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternateComments extends js.Object {
  var alternate: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var consequent: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind
}

object AlternateComments {
  @scala.inline
  def apply(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): AlternateComments = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateComments]
  }
}

