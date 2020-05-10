package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults_ extends js.Object {
  var font: Fonts_ = js.native
  var fontPath: String = js.native
}

object Defaults_ {
  @scala.inline
  def apply(font: Fonts_, fontPath: String): Defaults_ = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
  @scala.inline
  implicit class Defaults_Ops[Self <: Defaults_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: Fonts_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

