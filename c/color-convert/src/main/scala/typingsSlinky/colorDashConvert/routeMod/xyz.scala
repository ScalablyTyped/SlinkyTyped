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

trait xyz extends js.Object {
  def ansi16(from: XYZ): ANSI16
  def ansi256(from: XYZ): ANSI256
  def apple(from: XYZ): APPLE
  def cmyk(from: XYZ): CMYK
  def gray(from: XYZ): GRAY
  def hcg(from: XYZ): HCG
  def hex(from: XYZ): HEX
  def hsl(from: XYZ): HSL
  def hsv(from: XYZ): HSV
  def hwb(from: XYZ): HWB
  def keyword(from: XYZ): KEYWORD
  def lab(from: XYZ): LAB
  def lch(from: XYZ): LCH
  def rgb(from: XYZ): RGB
}

object xyz {
  @scala.inline
  def apply(
    ansi16: XYZ => ANSI16,
    ansi256: XYZ => ANSI256,
    apple: XYZ => APPLE,
    cmyk: XYZ => CMYK,
    gray: XYZ => GRAY,
    hcg: XYZ => HCG,
    hex: XYZ => HEX,
    hsl: XYZ => HSL,
    hsv: XYZ => HSV,
    hwb: XYZ => HWB,
    keyword: XYZ => KEYWORD,
    lab: XYZ => LAB,
    lch: XYZ => LCH,
    rgb: XYZ => RGB
  ): xyz = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[xyz]
  }
}

