package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`1`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.gray
import typingsSlinky.colorDashConvert.conversionsMod.CMYK
import typingsSlinky.colorDashConvert.conversionsMod.GRAY
import typingsSlinky.colorDashConvert.conversionsMod.HEX
import typingsSlinky.colorDashConvert.conversionsMod.HSL
import typingsSlinky.colorDashConvert.conversionsMod.HSV
import typingsSlinky.colorDashConvert.conversionsMod.HWB
import typingsSlinky.colorDashConvert.conversionsMod.LAB
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgray extends js.Object {
  val channels: `1`
  val labels: js.Array[gray]
  def cmyk(gray: GRAY): CMYK
  def hex(gray: GRAY): HEX
  def hsl(gray: GRAY): HSL
  def hsv(gray: GRAY): HSV
  def hwb(gray: GRAY): HWB
  def lab(gray: GRAY): LAB
  def rgb(gray: GRAY): RGB
}

object Typeofgray {
  @scala.inline
  def apply(
    channels: `1`,
    cmyk: GRAY => CMYK,
    hex: GRAY => HEX,
    hsl: GRAY => HSL,
    hsv: GRAY => HSV,
    hwb: GRAY => HWB,
    lab: GRAY => LAB,
    labels: js.Array[gray],
    rgb: GRAY => RGB
  ): Typeofgray = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], cmyk = js.Any.fromFunction1(cmyk), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofgray]
  }
}

