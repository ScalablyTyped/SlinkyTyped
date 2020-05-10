package typingsSlinky.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontDetailsResult extends js.Object {
  /** The font ID. Rather than the literal font ID preference value, this may be the ID of the font that the system resolves the preference value to. So, fontId can differ from the font passed to setFont, if, for example, the font is not available on the system. The empty string signifies fallback to the global script font setting. */
  var fontId: String = js.native
  /** The level of control this extension has over the setting. */
  var levelOfControl: String = js.native
}

object FontDetailsResult {
  @scala.inline
  def apply(fontId: String, levelOfControl: String): FontDetailsResult = {
    val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDetailsResult]
  }
  @scala.inline
  implicit class FontDetailsResultOps[Self <: FontDetailsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelOfControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelOfControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

