package typingsSlinky.jqueryColorpicker.anon

import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.CMYK
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.HSL
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.HSV
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.LAB
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cmyk extends js.Object {
  var cmyk: CMYK
  var hsl: HSL
  var hsv: HSV
  var lab: LAB
  var rgb: RGB
}

object Cmyk {
  @scala.inline
  def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): Cmyk = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmyk]
  }
}

