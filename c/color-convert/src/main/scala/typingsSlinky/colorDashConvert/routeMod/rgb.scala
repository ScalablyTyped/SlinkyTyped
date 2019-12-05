package typingsSlinky.colorDashConvert.routeMod

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
import typingsSlinky.colorDashConvert.conversionsMod.LCH
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import typingsSlinky.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rgb extends js.Object {
  def ansi16(from: RGB): ANSI16
  def ansi256(from: RGB): ANSI256
  def apple(from: RGB): APPLE
  def cmyk(from: RGB): CMYK
  def gray(from: RGB): GRAY
  def hcg(from: RGB): HCG
  def hex(from: RGB): HEX
  def hsl(from: RGB): HSL
  def hsv(from: RGB): HSV
  def hwb(from: RGB): HWB
  def keyword(from: RGB): KEYWORD
  def lab(from: RGB): LAB
  def lch(from: RGB): LCH
  def xyz(from: RGB): XYZ
}

object rgb {
  @scala.inline
  def apply(
    ansi16: RGB => ANSI16,
    ansi256: RGB => ANSI256,
    apple: RGB => APPLE,
    cmyk: RGB => CMYK,
    gray: RGB => GRAY,
    hcg: RGB => HCG,
    hex: RGB => HEX,
    hsl: RGB => HSL,
    hsv: RGB => HSV,
    hwb: RGB => HWB,
    keyword: RGB => KEYWORD,
    lab: RGB => LAB,
    lch: RGB => LCH,
    xyz: RGB => XYZ
  ): rgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[rgb]
  }
}

