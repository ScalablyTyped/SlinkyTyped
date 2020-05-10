package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineHeight extends js.Object {
  var fontFamily: String = js.native
  var lineHeight: String = js.native
  var textSizeAdjust: String = js.native
}

object AnonLineHeight {
  @scala.inline
  def apply(fontFamily: String, lineHeight: String, textSizeAdjust: String): AnonLineHeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textSizeAdjust = textSizeAdjust.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineHeight]
  }
  @scala.inline
  implicit class AnonLineHeightOps[Self <: AnonLineHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSizeAdjust(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSizeAdjust")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

