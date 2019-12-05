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

trait hcg extends js.Object {
  def ansi16(from: HCG): ANSI16
  def ansi256(from: HCG): ANSI256
  def apple(from: HCG): APPLE
  def cmyk(from: HCG): CMYK
  def gray(from: HCG): GRAY
  def hex(from: HCG): HEX
  def hsl(from: HCG): HSL
  def hsv(from: HCG): HSV
  def hwb(from: HCG): HWB
  def keyword(from: HCG): KEYWORD
  def lab(from: HCG): LAB
  def lch(from: HCG): LCH
  def rgb(from: HCG): RGB
  def xyz(from: HCG): XYZ
}

object hcg {
  @scala.inline
  def apply(
    ansi16: HCG => ANSI16,
    ansi256: HCG => ANSI256,
    apple: HCG => APPLE,
    cmyk: HCG => CMYK,
    gray: HCG => GRAY,
    hex: HCG => HEX,
    hsl: HCG => HSL,
    hsv: HCG => HSV,
    hwb: HCG => HWB,
    keyword: HCG => KEYWORD,
    lab: HCG => LAB,
    lch: HCG => LCH,
    rgb: HCG => RGB,
    xyz: HCG => XYZ
  ): hcg = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hcg]
  }
}

