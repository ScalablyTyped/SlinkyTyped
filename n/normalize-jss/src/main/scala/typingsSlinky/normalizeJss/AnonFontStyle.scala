package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFontStyle extends js.Object {
  var fontStyle: String = js.native
}

object AnonFontStyle {
  @scala.inline
  def apply(fontStyle: String): AnonFontStyle = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontStyle]
  }
  @scala.inline
  implicit class AnonFontStyleOps[Self <: AnonFontStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

