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

trait hwb extends js.Object {
  def ansi16(from: HWB): ANSI16
  def ansi256(from: HWB): ANSI256
  def apple(from: HWB): APPLE
  def cmyk(from: HWB): CMYK
  def gray(from: HWB): GRAY
  def hcg(from: HWB): HCG
  def hex(from: HWB): HEX
  def hsl(from: HWB): HSL
  def hsv(from: HWB): HSV
  def keyword(from: HWB): KEYWORD
  def lab(from: HWB): LAB
  def lch(from: HWB): LCH
  def rgb(from: HWB): RGB
  def xyz(from: HWB): XYZ
}

object hwb {
  @scala.inline
  def apply(
    ansi16: HWB => ANSI16,
    ansi256: HWB => ANSI256,
    apple: HWB => APPLE,
    cmyk: HWB => CMYK,
    gray: HWB => GRAY,
    hcg: HWB => HCG,
    hex: HWB => HEX,
    hsl: HWB => HSL,
    hsv: HWB => HSV,
    keyword: HWB => KEYWORD,
    lab: HWB => LAB,
    lch: HWB => LCH,
    rgb: HWB => RGB,
    xyz: HWB => XYZ
  ): hwb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hwb]
  }
}

