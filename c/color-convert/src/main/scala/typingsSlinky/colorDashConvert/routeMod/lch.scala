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

trait lch extends js.Object {
  def ansi16(from: LCH): ANSI16
  def ansi256(from: LCH): ANSI256
  def apple(from: LCH): APPLE
  def cmyk(from: LCH): CMYK
  def gray(from: LCH): GRAY
  def hcg(from: LCH): HCG
  def hex(from: LCH): HEX
  def hsl(from: LCH): HSL
  def hsv(from: LCH): HSV
  def hwb(from: LCH): HWB
  def keyword(from: LCH): KEYWORD
  def lab(from: LCH): LAB
  def rgb(from: LCH): RGB
  def xyz(from: LCH): XYZ
}

object lch {
  @scala.inline
  def apply(
    ansi16: LCH => ANSI16,
    ansi256: LCH => ANSI256,
    apple: LCH => APPLE,
    cmyk: LCH => CMYK,
    gray: LCH => GRAY,
    hcg: LCH => HCG,
    hex: LCH => HEX,
    hsl: LCH => HSL,
    hsv: LCH => HSV,
    hwb: LCH => HWB,
    keyword: LCH => KEYWORD,
    lab: LCH => LAB,
    rgb: LCH => RGB,
    xyz: LCH => XYZ
  ): lch = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[lch]
  }
}

