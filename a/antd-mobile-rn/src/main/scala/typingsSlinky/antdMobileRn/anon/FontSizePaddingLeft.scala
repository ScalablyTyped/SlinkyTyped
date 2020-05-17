package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizePaddingLeft extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var paddingLeft: Double = js.native
}

object FontSizePaddingLeft {
  @scala.inline
  def apply(color: String, fontSize: Double, paddingLeft: Double): FontSizePaddingLeft = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePaddingLeft]
  }
  @scala.inline
  implicit class FontSizePaddingLeftOps[Self <: FontSizePaddingLeft] (val x: Self) extends AnyVal {
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
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

