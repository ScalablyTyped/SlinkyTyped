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

trait apple extends js.Object {
  def ansi16(from: APPLE): ANSI16
  def ansi256(from: APPLE): ANSI256
  def cmyk(from: APPLE): CMYK
  def gray(from: APPLE): GRAY
  def hcg(from: APPLE): HCG
  def hex(from: APPLE): HEX
  def hsl(from: APPLE): HSL
  def hsv(from: APPLE): HSV
  def hwb(from: APPLE): HWB
  def keyword(from: APPLE): KEYWORD
  def lab(from: APPLE): LAB
  def lch(from: APPLE): LCH
  def rgb(from: APPLE): RGB
  def xyz(from: APPLE): XYZ
}

object apple {
  @scala.inline
  def apply(
    ansi16: APPLE => ANSI16,
    ansi256: APPLE => ANSI256,
    cmyk: APPLE => CMYK,
    gray: APPLE => GRAY,
    hcg: APPLE => HCG,
    hex: APPLE => HEX,
    hsl: APPLE => HSL,
    hsv: APPLE => HSV,
    hwb: APPLE => HWB,
    keyword: APPLE => KEYWORD,
    lab: APPLE => LAB,
    lch: APPLE => LCH,
    rgb: APPLE => RGB,
    xyz: APPLE => XYZ
  ): apple = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[apple]
  }
}

