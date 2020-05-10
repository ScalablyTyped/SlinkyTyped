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
trait gray extends js.Object {
  def ansi16(from: GRAY_): ANSI16_ = js.native
  def ansi256(from: GRAY_): ANSI256_ = js.native
  def apple(from: GRAY_): APPLE_ = js.native
  def cmyk(from: GRAY_): CMYK_ = js.native
  def hcg(from: GRAY_): HCG_ = js.native
  def hex(from: GRAY_): HEX_ = js.native
  def hsl(from: GRAY_): HSL_ = js.native
  def hsv(from: GRAY_): HSV_ = js.native
  def hwb(from: GRAY_): HWB_ = js.native
  def keyword(from: GRAY_): KEYWORD_ = js.native
  def lab(from: GRAY_): LAB_ = js.native
  def lch(from: GRAY_): LCH_ = js.native
  def rgb(from: GRAY_): RGB_ = js.native
  def xyz(from: GRAY_): XYZ_ = js.native
}

object gray {
  @scala.inline
  def apply(
    ansi16: GRAY_ => ANSI16_,
    ansi256: GRAY_ => ANSI256_,
    apple: GRAY_ => APPLE_,
    cmyk: GRAY_ => CMYK_,
    hcg: GRAY_ => HCG_,
    hex: GRAY_ => HEX_,
    hsl: GRAY_ => HSL_,
    hsv: GRAY_ => HSV_,
    hwb: GRAY_ => HWB_,
    keyword: GRAY_ => KEYWORD_,
    lab: GRAY_ => LAB_,
    lch: GRAY_ => LCH_,
    rgb: GRAY_ => RGB_,
    xyz: GRAY_ => XYZ_
  ): gray = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[gray]
  }
  @scala.inline
  implicit class grayOps[Self <: gray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi16(value: GRAY_ => ANSI16_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnsi256(value: GRAY_ => ANSI256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: GRAY_ => APPLE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCmyk(value: GRAY_ => CMYK_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: GRAY_ => HCG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHex(value: GRAY_ => HEX_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: GRAY_ => HSL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsv(value: GRAY_ => HSV_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHwb(value: GRAY_ => HWB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: GRAY_ => KEYWORD_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLab(value: GRAY_ => LAB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLch(value: GRAY_ => LCH_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRgb(value: GRAY_ => RGB_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXyz(value: GRAY_ => XYZ_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xyz")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

