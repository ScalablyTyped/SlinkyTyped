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

trait keyword extends js.Object {
  def ansi16(from: KEYWORD): ANSI16
  def ansi256(from: KEYWORD): ANSI256
  def apple(from: KEYWORD): APPLE
  def cmyk(from: KEYWORD): CMYK
  def gray(from: KEYWORD): GRAY
  def hcg(from: KEYWORD): HCG
  def hex(from: KEYWORD): HEX
  def hsl(from: KEYWORD): HSL
  def hsv(from: KEYWORD): HSV
  def hwb(from: KEYWORD): HWB
  def lab(from: KEYWORD): LAB
  def lch(from: KEYWORD): LCH
  def rgb(from: KEYWORD): RGB
  def xyz(from: KEYWORD): XYZ
}

object keyword {
  @scala.inline
  def apply(
    ansi16: KEYWORD => ANSI16,
    ansi256: KEYWORD => ANSI256,
    apple: KEYWORD => APPLE,
    cmyk: KEYWORD => CMYK,
    gray: KEYWORD => GRAY,
    hcg: KEYWORD => HCG,
    hex: KEYWORD => HEX,
    hsl: KEYWORD => HSL,
    hsv: KEYWORD => HSV,
    hwb: KEYWORD => HWB,
    lab: KEYWORD => LAB,
    lch: KEYWORD => LCH,
    rgb: KEYWORD => RGB,
    xyz: KEYWORD => XYZ
  ): keyword = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[keyword]
  }
}

