package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accessibility extends js.Object {
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var value: ExpressionKind | PatternKind
}

object Accessibility {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    value: ExpressionKind | PatternKind,
    accessibility: js.UndefOr[Null | LiteralKind] = js.undefined,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    shorthand: js.UndefOr[Boolean] = js.undefined
  ): Accessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessibility]
  }
}

