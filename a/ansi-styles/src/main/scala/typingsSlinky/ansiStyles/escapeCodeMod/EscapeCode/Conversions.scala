package typingsSlinky.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversions extends js.Object {
  def ansi(ansi: Double): String = js.native
  def ansi256(ansi256: Double): String = js.native
  /**
    * apple RGB to ansi code
    */
  def apple(r: Double, g: Double, b: Double): String = js.native
  def cmyk(c: Double, m: Double, y: Double, k: Double): String = js.native
  def gray(grayscale: Double): String = js.native
  def hcg(h: Double, c: Double, g: Double): String = js.native
  def hex(hex: String): String = js.native
  def hsl(h: Double, s: Double, l: Double): String = js.native
  def hsv(h: Double, s: Double, v: Double): String = js.native
  def hwb(h: Double, w: Double, b: Double): String = js.native
  /**
    * color keyword in css to ansi code
    */
  def keyword(
    keyword: /* keyof ansi-styles.anon.TypeofcssKeywords */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 148 */ js.Any
  ): String = js.native
  def lab(l: Double, a: Double, b: Double): String = js.native
  def lch(l: Double, c: Double, h: Double): String = js.native
  def rgb(r: Double, g: Double, b: Double): String = js.native
  def xyz(x: Double, y: Double, z: Double): String = js.native
}

object Conversions {
  @scala.inline
  def apply(
    ansi: Double => String,
    ansi256: Double => String,
    apple: (Double, Double, Double) => String,
    cmyk: (Double, Double, Double, Double) => String,
    gray: Double => String,
    hcg: (Double, Double, Double) => String,
    hex: String => String,
    hsl: (Double, Double, Double) => String,
    hsv: (Double, Double, Double) => String,
    hwb: (Double, Double, Double) => String,
    keyword: /* keyof ansi-styles.anon.TypeofcssKeywords */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 148 */ js.Any => String,
    lab: (Double, Double, Double) => String,
    lch: (Double, Double, Double) => String,
    rgb: (Double, Double, Double) => String,
    xyz: (Double, Double, Double) => String
  ): Conversions = {
    val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction3(apple), cmyk = js.Any.fromFunction4(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction3(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction3(lab), lch = js.Any.fromFunction3(lch), rgb = js.Any.fromFunction3(rgb), xyz = js.Any.fromFunction3(xyz))
    __obj.asInstanceOf[Conversions]
  }
  @scala.inline
  implicit class ConversionsOps[Self <: Conversions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnsi256(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApple(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCmyk(value: (Double, Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGray(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHcg(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcg")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHex(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHsl(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHsv(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHwb(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withKeyword(
      value: /* keyof ansi-styles.anon.TypeofcssKeywords */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 148 */ js.Any => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLab(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLch(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRgb(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withXyz(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xyz")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

