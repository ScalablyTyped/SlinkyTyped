package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases extends js.Object {
  var cases: js.Array[SwitchCaseKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var discriminant: ExpressionKind
  var lexical: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Cases {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    lexical: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(lexical)) __obj.updateDynamic("lexical")(lexical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cases]
  }
}

