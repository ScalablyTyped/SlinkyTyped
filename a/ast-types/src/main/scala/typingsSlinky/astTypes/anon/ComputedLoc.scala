package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var `object`: ExpressionKind
  var optional: js.UndefOr[Boolean] = js.undefined
  var property: IdentifierKind | ExpressionKind
}

object ComputedLoc {
  @scala.inline
  def apply(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined
  ): ComputedLoc = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedLoc]
  }
}

