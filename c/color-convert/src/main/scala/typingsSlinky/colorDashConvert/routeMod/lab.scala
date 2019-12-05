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

trait lab extends js.Object {
  def ansi16(from: LAB): ANSI16
  def ansi256(from: LAB): ANSI256
  def apple(from: LAB): APPLE
  def cmyk(from: LAB): CMYK
  def gray(from: LAB): GRAY
  def hcg(from: LAB): HCG
  def hex(from: LAB): HEX
  def hsl(from: LAB): HSL
  def hsv(from: LAB): HSV
  def hwb(from: LAB): HWB
  def keyword(from: LAB): KEYWORD
  def lch(from: LAB): LCH
  def rgb(from: LAB): RGB
  def xyz(from: LAB): XYZ
}

object lab {
  @scala.inline
  def apply(
    ansi16: LAB => ANSI16,
    ansi256: LAB => ANSI256,
    apple: LAB => APPLE,
    cmyk: LAB => CMYK,
    gray: LAB => GRAY,
    hcg: LAB => HCG,
    hex: LAB => HEX,
    hsl: LAB => HSL,
    hsv: LAB => HSV,
    hwb: LAB => HWB,
    keyword: LAB => KEYWORD,
    lch: LAB => LCH,
    rgb: LAB => RGB,
    xyz: LAB => XYZ
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[lab]
  }
}

