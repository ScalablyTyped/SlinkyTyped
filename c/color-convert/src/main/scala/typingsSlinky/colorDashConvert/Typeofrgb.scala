package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`3`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.rgb
import typingsSlinky.colorDashConvert.conversionsMod.ANSI16
import typingsSlinky.colorDashConvert.conversionsMod.ANSI256
import typingsSlinky.colorDashConvert.conversionsMod.APPLE
import typingsSlinky.colorDashConvert.conversionsMod.CMYK
import typingsSlinky.colorDashConvert.conversionsMod.GRAY
import typingsSlinky.colorDashConvert.conversionsMod.HCG
import typingsSlinky.colorDashConvert.conversionsMod.HEX
import typingsSlinky.colorDashConvert.conversionsMod.HSL
import typingsSlinky.colorDashConvert.conversionsMod.HSV
import typingsSlinky.colorDashConvert.conversionsMod.HWB
import typingsSlinky.colorDashConvert.conversionsMod.KEYWORD
import typingsSlinky.colorDashConvert.conversionsMod.LAB
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import typingsSlinky.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrgb extends js.Object {
  val channels: `3`
  val labels: rgb
  def ansi16(rgb: RGB): ANSI16
  def ansi256(rgb: RGB): ANSI256
  def apple(rgb: RGB): APPLE
  def cmyk(rgb: RGB): CMYK
  def gray(rgb: RGB): GRAY
  def hcg(rgb: RGB): HCG
  def hex(rgb: RGB): HEX
  def hsl(rgb: RGB): HSL
  def hsv(rgb: RGB): HSV
  def hwb(rgb: RGB): HWB
  def keyword(rgb: RGB): KEYWORD
  def lab(rgb: RGB): LAB
  def xyz(rgb: RGB): XYZ
}

object Typeofrgb {
  @scala.inline
  def apply(
    ansi16: RGB => ANSI16,
    ansi256: RGB => ANSI256,
    apple: RGB => APPLE,
    channels: `3`,
    cmyk: RGB => CMYK,
    gray: RGB => GRAY,
    hcg: RGB => HCG,
    hex: RGB => HEX,
    hsl: RGB => HSL,
    hsv: RGB => HSV,
    hwb: RGB => HWB,
    keyword: RGB => KEYWORD,
    lab: RGB => LAB,
    labels: rgb,
    xyz: RGB => XYZ
  ): Typeofrgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), channels = channels.asInstanceOf[js.Any], cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeofrgb]
  }
}

