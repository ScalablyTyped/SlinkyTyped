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

@js.native
trait rgb extends js.Object {
  def ansi16(from: RGB_): ANSI16_ = js.native
  def ansi256(from: RGB_): ANSI256_ = js.native
  def apple(from: RGB_): APPLE_ = js.native
  def cmyk(from: RGB_): CMYK_ = js.native
  def gray(from: RGB_): GRAY_ = js.native
  def hcg(from: RGB_): HCG_ = js.native
  def hex(from: RGB_): HEX_ = js.native
  def hsl(from: RGB_): HSL_ = js.native
  def hsv(from: RGB_): HSV_ = js.native
  def hwb(from: RGB_): HWB_ = js.native
  def keyword(from: RGB_): KEYWORD_ = js.native
  def lab(from: RGB_): LAB_ = js.native
  def lch(from: RGB_): LCH_ = js.native
  def xyz(from: RGB_): XYZ_ = js.native
}

object rgb {
  @scala.inline
  def apply(
    ansi16: RGB_ => ANSI16_,
    ansi256: RGB_ => ANSI256_,
    apple: RGB_ => APPLE_,
    cmyk: RGB_ => CMYK_,
    gray: RGB_ => GRAY_,
    hcg: RGB_ => HCG_,
    hex: RGB_ => HEX_,
    hsl: RGB_ => HSL_,
    hsv: RGB_ => HSV_,
    hwb: RGB_ => HWB_,
    keyword: RGB_ => KEYWORD_,
    lab: RGB_ => LAB_,
    lch: RGB_ => LCH_,
    xyz: RGB_ => XYZ_
  ): rgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[rgb]
  }
  @scala.inline
  implicit class rgbOps[Self <: rgb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi16(value: RGB_ => ANSI16_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnsi256(value: RGB_ => ANSI256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: RGB_ => APPLE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCmyk(value: RGB_ => CMYK_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGray(value: RGB_ => GRAY_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: RGB_ => HCG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHex(value: RGB_ => HEX_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: RGB_ => HSL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsv(value: RGB_ => HSV_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHwb(value: RGB_ => HWB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: RGB_ => KEYWORD_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLab(value: RGB_ => LAB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLch(value: RGB_ => LCH_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXyz(value: RGB_ => XYZ_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xyz")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

