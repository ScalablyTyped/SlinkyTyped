package typingsSlinky.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFontDetails
  extends typingsSlinky.chrome.chrome.fontSettings.FontDetails {
  /** The font ID. The empty string means to fallback to the global script font setting. */
  var fontId: String = js.native
}

object SetFontDetails {
  @scala.inline
  def apply(fontId: String, genericFamily: String): SetFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontDetails]
  }
  @scala.inline
  implicit class SetFontDetailsOps[Self <: SetFontDetails] (val x: Self) extends AnyVal {
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
  }
  
}

