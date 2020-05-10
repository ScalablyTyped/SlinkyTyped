package typingsSlinky.jqueryColorpicker

import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.CMYK
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.HSL
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.HSV
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.LAB
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCmyk extends js.Object {
  var cmyk: CMYK = js.native
  var hsl: HSL = js.native
  var hsv: HSV = js.native
  var lab: LAB = js.native
  var rgb: RGB = js.native
}

object AnonCmyk {
  @scala.inline
  def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): AnonCmyk = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCmyk]
  }
  @scala.inline
  implicit class AnonCmykOps[Self <: AnonCmyk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmyk(value: CMYK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsl(value: HSL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsv(value: HSV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLab(value: LAB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgb(value: RGB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

