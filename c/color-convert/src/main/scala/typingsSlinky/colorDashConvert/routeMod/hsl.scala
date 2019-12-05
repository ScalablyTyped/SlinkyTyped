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

trait hsl extends js.Object {
  def ansi16(from: HSL): ANSI16
  def ansi256(from: HSL): ANSI256
  def apple(from: HSL): APPLE
  def cmyk(from: HSL): CMYK
  def gray(from: HSL): GRAY
  def hcg(from: HSL): HCG
  def hex(from: HSL): HEX
  def hsv(from: HSL): HSV
  def hwb(from: HSL): HWB
  def keyword(from: HSL): KEYWORD
  def lab(from: HSL): LAB
  def lch(from: HSL): LCH
  def rgb(from: HSL): RGB
  def xyz(from: HSL): XYZ
}

object hsl {
  @scala.inline
  def apply(
    ansi16: HSL => ANSI16,
    ansi256: HSL => ANSI256,
    apple: HSL => APPLE,
    cmyk: HSL => CMYK,
    gray: HSL => GRAY,
    hcg: HSL => HCG,
    hex: HSL => HEX,
    hsv: HSL => HSV,
    hwb: HSL => HWB,
    keyword: HSL => KEYWORD,
    lab: HSL => LAB,
    lch: HSL => LCH,
    rgb: HSL => RGB,
    xyz: HSL => XYZ
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hsl]
  }
}

