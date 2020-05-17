package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamily extends js.Object {
  var fontFamily: String = js.native
  var fontSize: Double = js.native
  var fontStyle: String = js.native
  var fontWieght: String = js.native
}

object FontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: Double, fontStyle: String, fontWieght: String): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWieght = fontWieght.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  @scala.inline
  implicit class FontFamilyOps[Self <: FontFamily] (val x: Self) extends AnyVal {
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
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWieght(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWieght")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

