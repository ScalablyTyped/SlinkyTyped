package typingsSlinky.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontGlyph> */
@js.native
trait PartialRaphaelFontGlyph extends js.Object {
  var d: js.UndefOr[String] = js.native
  var w: js.UndefOr[Double] = js.native
}

object PartialRaphaelFontGlyph {
  @scala.inline
  def apply(): PartialRaphaelFontGlyph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaphaelFontGlyph]
  }
  @scala.inline
  implicit class PartialRaphaelFontGlyphOps[Self <: PartialRaphaelFontGlyph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
  }
  
}

