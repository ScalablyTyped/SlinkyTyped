package typingsSlinky.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontFace> */
@js.native
trait PartialRaphaelFontFace extends js.Object {
  var ascent: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var `font-family`: js.UndefOr[String] = js.native
  var `font-stretch`: js.UndefOr[String] = js.native
  var `font-style`: js.UndefOr[String] = js.native
  var `font-weight`: js.UndefOr[Double | String] = js.native
  var `panose-1`: js.UndefOr[String] = js.native
  var `underline-position`: js.UndefOr[Double | String] = js.native
  var `underline-thickness`: js.UndefOr[Double | String] = js.native
  var `unicode-range`: js.UndefOr[String] = js.native
  var `units-per-em`: js.UndefOr[Double | String] = js.native
  var `x-height`: js.UndefOr[Double | String] = js.native
}

object PartialRaphaelFontFace {
  @scala.inline
  def apply(): PartialRaphaelFontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaphaelFontFace]
  }
  @scala.inline
  implicit class PartialRaphaelFontFaceOps[Self <: PartialRaphaelFontFace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(js.undefined)
        ret
    }
    @scala.inline
    def withBbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withDescent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-stretch`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-stretch`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withPanose-1`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panose-1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPanose-1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panose-1")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnderline-position`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnderline-position`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnderline-thickness`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline-thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnderline-thickness`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline-thickness")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnicode-range`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnicode-range`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-range")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnits-per-em`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units-per-em")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnits-per-em`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units-per-em")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-height`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-height")(js.undefined)
        ret
    }
  }
  
}

