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
trait lab extends js.Object {
  def ansi16(from: LAB_): ANSI16_ = js.native
  def ansi256(from: LAB_): ANSI256_ = js.native
  def apple(from: LAB_): APPLE_ = js.native
  def cmyk(from: LAB_): CMYK_ = js.native
  def gray(from: LAB_): GRAY_ = js.native
  def hcg(from: LAB_): HCG_ = js.native
  def hex(from: LAB_): HEX_ = js.native
  def hsl(from: LAB_): HSL_ = js.native
  def hsv(from: LAB_): HSV_ = js.native
  def hwb(from: LAB_): HWB_ = js.native
  def keyword(from: LAB_): KEYWORD_ = js.native
  def lch(from: LAB_): LCH_ = js.native
  def rgb(from: LAB_): RGB_ = js.native
  def xyz(from: LAB_): XYZ_ = js.native
}

object lab {
  @scala.inline
  def apply(
    ansi16: LAB_ => ANSI16_,
    ansi256: LAB_ => ANSI256_,
    apple: LAB_ => APPLE_,
    cmyk: LAB_ => CMYK_,
    gray: LAB_ => GRAY_,
    hcg: LAB_ => HCG_,
    hex: LAB_ => HEX_,
    hsl: LAB_ => HSL_,
    hsv: LAB_ => HSV_,
    hwb: LAB_ => HWB_,
    keyword: LAB_ => KEYWORD_,
    lch: LAB_ => LCH_,
    rgb: LAB_ => RGB_,
    xyz: LAB_ => XYZ_
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[lab]
  }
  @scala.inline
  implicit class labOps[Self <: lab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi16(value: LAB_ => ANSI16_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnsi256(value: LAB_ => ANSI256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: LAB_ => APPLE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCmyk(value: LAB_ => CMYK_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGray(value: LAB_ => GRAY_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: LAB_ => HCG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHex(value: LAB_ => HEX_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: LAB_ => HSL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsv(value: LAB_ => HSV_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHwb(value: LAB_ => HWB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: LAB_ => KEYWORD_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLch(value: LAB_ => LCH_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRgb(value: LAB_ => RGB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXyz(value: LAB_ => XYZ_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xyz")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

