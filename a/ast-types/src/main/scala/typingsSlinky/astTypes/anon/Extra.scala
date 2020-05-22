package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extra: js.UndefOr[RawRawValue] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var raw: js.UndefOr[String | Null] = js.undefined
  var regex: js.UndefOr[Flags | Null] = js.undefined
  var value: Double
}

object Extra {
  @scala.inline
  def apply(
    value: Double,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    extra: RawRawValue = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    raw: js.UndefOr[Null | String] = js.undefined,
    regex: js.UndefOr[Null | Flags] = js.undefined
  ): Extra = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
}

