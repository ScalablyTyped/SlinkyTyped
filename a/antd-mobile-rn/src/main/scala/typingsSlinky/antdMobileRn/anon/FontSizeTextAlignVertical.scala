package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeTextAlignVertical extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var textAlignVertical: String = js.native
}

object FontSizeTextAlignVertical {
  @scala.inline
  def apply(color: String, fontSize: Double, textAlignVertical: String): FontSizeTextAlignVertical = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeTextAlignVertical]
  }
  @scala.inline
  implicit class FontSizeTextAlignVerticalOps[Self <: FontSizeTextAlignVertical] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlignVertical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

