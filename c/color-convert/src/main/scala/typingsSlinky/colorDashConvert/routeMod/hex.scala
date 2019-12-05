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

trait hex extends js.Object {
  def ansi16(from: HEX): ANSI16
  def ansi256(from: HEX): ANSI256
  def apple(from: HEX): APPLE
  def cmyk(from: HEX): CMYK
  def gray(from: HEX): GRAY
  def hcg(from: HEX): HCG
  def hsl(from: HEX): HSL
  def hsv(from: HEX): HSV
  def hwb(from: HEX): HWB
  def keyword(from: HEX): KEYWORD
  def lab(from: HEX): LAB
  def lch(from: HEX): LCH
  def rgb(from: HEX): RGB
  def xyz(from: HEX): XYZ
}

object hex {
  @scala.inline
  def apply(
    ansi16: HEX => ANSI16,
    ansi256: HEX => ANSI256,
    apple: HEX => APPLE,
    cmyk: HEX => CMYK,
    gray: HEX => GRAY,
    hcg: HEX => HCG,
    hsl: HEX => HSL,
    hsv: HEX => HSV,
    hwb: HEX => HWB,
    keyword: HEX => KEYWORD,
    lab: HEX => LAB,
    lch: HEX => LCH,
    rgb: HEX => RGB,
    xyz: HEX => XYZ
  ): hex = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hex]
  }
}

