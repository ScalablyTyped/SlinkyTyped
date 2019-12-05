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

trait cmyk extends js.Object {
  def ansi16(from: CMYK): ANSI16
  def ansi256(from: CMYK): ANSI256
  def apple(from: CMYK): APPLE
  def gray(from: CMYK): GRAY
  def hcg(from: CMYK): HCG
  def hex(from: CMYK): HEX
  def hsl(from: CMYK): HSL
  def hsv(from: CMYK): HSV
  def hwb(from: CMYK): HWB
  def keyword(from: CMYK): KEYWORD
  def lab(from: CMYK): LAB
  def lch(from: CMYK): LCH
  def rgb(from: CMYK): RGB
  def xyz(from: CMYK): XYZ
}

object cmyk {
  @scala.inline
  def apply(
    ansi16: CMYK => ANSI16,
    ansi256: CMYK => ANSI256,
    apple: CMYK => APPLE,
    gray: CMYK => GRAY,
    hcg: CMYK => HCG,
    hex: CMYK => HEX,
    hsl: CMYK => HSL,
    hsv: CMYK => HSV,
    hwb: CMYK => HWB,
    keyword: CMYK => KEYWORD,
    lab: CMYK => LAB,
    lch: CMYK => LCH,
    rgb: CMYK => RGB,
    xyz: CMYK => XYZ
  ): cmyk = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[cmyk]
  }
}

