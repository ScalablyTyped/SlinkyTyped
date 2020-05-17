package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizePaddingHorizontal extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var paddingHorizontal: Double = js.native
  var textAlign: String = js.native
}

object FontSizePaddingHorizontal {
  @scala.inline
  def apply(color: String, fontSize: Double, paddingHorizontal: Double, textAlign: String): FontSizePaddingHorizontal = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePaddingHorizontal]
  }
  @scala.inline
  implicit class FontSizePaddingHorizontalOps[Self <: FontSizePaddingHorizontal] (val x: Self) extends AnyVal {
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
    def withPaddingHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

