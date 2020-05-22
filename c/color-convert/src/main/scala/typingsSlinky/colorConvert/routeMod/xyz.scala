package typingsSlinky.colorConvert.routeMod

import typingsSlinky.colorConvert.conversionsMod.ANSI16_
import typingsSlinky.colorConvert.conversionsMod.ANSI256_
import typingsSlinky.colorConvert.conversionsMod.APPLE_
import typingsSlinky.colorConvert.conversionsMod.CMYK_
import typingsSlinky.colorConvert.conversionsMod.GRAY_
import typingsSlinky.colorConvert.conversionsMod.HCG_
import typingsSlinky.colorConvert.conversionsMod.HEX_
import typingsSlinky.colorConvert.conversionsMod.HSL_
import typingsSlinky.colorConvert.conversionsMod.HSV_
import typingsSlinky.colorConvert.conversionsMod.HWB_
import typingsSlinky.colorConvert.conversionsMod.KEYWORD_
import typingsSlinky.colorConvert.conversionsMod.LAB_
import typingsSlinky.colorConvert.conversionsMod.LCH_
import typingsSlinky.colorConvert.conversionsMod.RGB_
import typingsSlinky.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait xyz extends js.Object {
  def ansi16(from: XYZ_): ANSI16_
  def ansi256(from: XYZ_): ANSI256_
  def apple(from: XYZ_): APPLE_
  def cmyk(from: XYZ_): CMYK_
  def gray(from: XYZ_): GRAY_
  def hcg(from: XYZ_): HCG_
  def hex(from: XYZ_): HEX_
  def hsl(from: XYZ_): HSL_
  def hsv(from: XYZ_): HSV_
  def hwb(from: XYZ_): HWB_
  def keyword(from: XYZ_): KEYWORD_
  def lab(from: XYZ_): LAB_
  def lch(from: XYZ_): LCH_
  def rgb(from: XYZ_): RGB_
}

object xyz {
  @scala.inline
  def apply(
    ansi16: XYZ_ => ANSI16_,
    ansi256: XYZ_ => ANSI256_,
    apple: XYZ_ => APPLE_,
    cmyk: XYZ_ => CMYK_,
    gray: XYZ_ => GRAY_,
    hcg: XYZ_ => HCG_,
    hex: XYZ_ => HEX_,
    hsl: XYZ_ => HSL_,
    hsv: XYZ_ => HSV_,
    hwb: XYZ_ => HWB_,
    keyword: XYZ_ => KEYWORD_,
    lab: XYZ_ => LAB_,
    lch: XYZ_ => LCH_,
    rgb: XYZ_ => RGB_
  ): xyz = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[xyz]
  }
}

