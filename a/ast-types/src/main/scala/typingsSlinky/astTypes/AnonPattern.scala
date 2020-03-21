package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPattern extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var flags: String
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var pattern: String
  var regex: js.UndefOr[AnonFlags | Null] = js.undefined
  var value: js.UndefOr[js.RegExp] = js.undefined
}

object AnonPattern {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: AnonFlags = null,
    value: js.RegExp = null
  ): AnonPattern = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPattern]
  }
}

