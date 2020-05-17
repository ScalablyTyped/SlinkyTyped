package typingsSlinky.raphael.mod

import typingsSlinky.raphael.anon.PartialRaphaelFontFace
import typingsSlinky.raphael.anon.PartialRaphaelFontGlyph
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelFont extends js.Object {
  /** The font faces that are available in this font. */
  var face: PartialRaphaelFontFace = js.native
  /** The glyphs that are available in this font. */
  var glyphs: Record[String, PartialRaphaelFontGlyph] = js.native
  /** The width of this font. */
  var w: Double = js.native
}

object RaphaelFont {
  @scala.inline
  def apply(face: PartialRaphaelFontFace, glyphs: Record[String, PartialRaphaelFontGlyph], w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFont]
  }
  @scala.inline
  implicit class RaphaelFontOps[Self <: RaphaelFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFace(value: PartialRaphaelFontFace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphs(value: Record[String, PartialRaphaelFontGlyph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

