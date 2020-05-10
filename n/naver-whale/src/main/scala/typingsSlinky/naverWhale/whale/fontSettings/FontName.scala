package typingsSlinky.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontName extends js.Object {
  /** The display name of the font. */
  var displayName: String = js.native
  /** The font ID. */
  var fontId: String = js.native
}

object FontName {
  @scala.inline
  def apply(displayName: String, fontId: String): FontName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fontId = fontId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  @scala.inline
  implicit class FontNameOps[Self <: FontName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

