package typingsSlinky.lyricist

import typingsSlinky.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextFormat extends js.Object {
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object AnonTextFormat {
  @scala.inline
  def apply(textFormat: LyricistTextFormat = null): AnonTextFormat = {
    val __obj = js.Dynamic.literal()
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextFormat]
  }
}

