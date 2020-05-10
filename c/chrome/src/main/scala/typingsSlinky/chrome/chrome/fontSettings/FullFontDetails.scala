package typingsSlinky.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullFontDetails extends js.Object {
  /** The font ID. See the description in getFont. */
  var fontId: String = js.native
  /** The generic font family for which the font setting has changed. */
  var genericFamily: String = js.native
  /** The level of control this extension has over the setting. */
  var levelOfControl: String = js.native
  /** Optional. The script code for which the font setting has changed.  */
  var script: js.UndefOr[String] = js.native
}

object FullFontDetails {
  @scala.inline
  def apply(fontId: String, genericFamily: String, levelOfControl: String): FullFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullFontDetails]
  }
  @scala.inline
  implicit class FullFontDetailsOps[Self <: FullFontDetails] (val x: Self) extends AnyVal {
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
    def withGenericFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelOfControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelOfControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
  }
  
}

