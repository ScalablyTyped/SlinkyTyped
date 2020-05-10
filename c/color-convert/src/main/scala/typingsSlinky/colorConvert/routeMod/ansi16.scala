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
trait ansi16 extends js.Object {
  def ansi256(from: ANSI16_): ANSI256_ = js.native
  def apple(from: ANSI16_): APPLE_ = js.native
  def cmyk(from: ANSI16_): CMYK_ = js.native
  def gray(from: ANSI16_): GRAY_ = js.native
  def hcg(from: ANSI16_): HCG_ = js.native
  def hex(from: ANSI16_): HEX_ = js.native
  def hsl(from: ANSI16_): HSL_ = js.native
  def hsv(from: ANSI16_): HSV_ = js.native
  def hwb(from: ANSI16_): HWB_ = js.native
  def keyword(from: ANSI16_): KEYWORD_ = js.native
  def lab(from: ANSI16_): LAB_ = js.native
  def lch(from: ANSI16_): LCH_ = js.native
  def rgb(from: ANSI16_): RGB_ = js.native
  def xyz(from: ANSI16_): XYZ_ = js.native
}

object ansi16 {
  @scala.inline
  def apply(
    ansi256: ANSI16_ => ANSI256_,
    apple: ANSI16_ => APPLE_,
    cmyk: ANSI16_ => CMYK_,
    gray: ANSI16_ => GRAY_,
    hcg: ANSI16_ => HCG_,
    hex: ANSI16_ => HEX_,
    hsl: ANSI16_ => HSL_,
    hsv: ANSI16_ => HSV_,
    hwb: ANSI16_ => HWB_,
    keyword: ANSI16_ => KEYWORD_,
    lab: ANSI16_ => LAB_,
    lch: ANSI16_ => LCH_,
    rgb: ANSI16_ => RGB_,
    xyz: ANSI16_ => XYZ_
  ): ansi16 = {
    val __obj = js.Dynamic.literal(ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[ansi16]
  }
  @scala.inline
  implicit class ansi16Ops[Self <: ansi16] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi256(value: ANSI16_ => ANSI256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: ANSI16_ => APPLE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCmyk(value: ANSI16_ => CMYK_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGray(value: ANSI16_ => GRAY_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: ANSI16_ => HCG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHex(value: ANSI16_ => HEX_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: ANSI16_ => HSL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsv(value: ANSI16_ => HSV_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHwb(value: ANSI16_ => HWB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: ANSI16_ => KEYWORD_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLab(value: ANSI16_ => LAB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLch(value: ANSI16_ => LCH_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRgb(value: ANSI16_ => RGB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXyz(value: ANSI16_ => XYZ_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xyz")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

