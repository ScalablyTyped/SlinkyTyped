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
trait xyz extends js.Object {
  def ansi16(from: XYZ_): ANSI16_ = js.native
  def ansi256(from: XYZ_): ANSI256_ = js.native
  def apple(from: XYZ_): APPLE_ = js.native
  def cmyk(from: XYZ_): CMYK_ = js.native
  def gray(from: XYZ_): GRAY_ = js.native
  def hcg(from: XYZ_): HCG_ = js.native
  def hex(from: XYZ_): HEX_ = js.native
  def hsl(from: XYZ_): HSL_ = js.native
  def hsv(from: XYZ_): HSV_ = js.native
  def hwb(from: XYZ_): HWB_ = js.native
  def keyword(from: XYZ_): KEYWORD_ = js.native
  def lab(from: XYZ_): LAB_ = js.native
  def lch(from: XYZ_): LCH_ = js.native
  def rgb(from: XYZ_): RGB_ = js.native
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
  @scala.inline
  implicit class xyzOps[Self <: xyz] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi16(value: XYZ_ => ANSI16_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnsi256(value: XYZ_ => ANSI256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: XYZ_ => APPLE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCmyk(value: XYZ_ => CMYK_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGray(value: XYZ_ => GRAY_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: XYZ_ => HCG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHex(value: XYZ_ => HEX_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: XYZ_ => HSL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsv(value: XYZ_ => HSV_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHwb(value: XYZ_ => HWB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: XYZ_ => KEYWORD_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLab(value: XYZ_ => LAB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLch(value: XYZ_ => LCH_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRgb(value: XYZ_ => RGB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

