package typingsSlinky.fontkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glyph extends js.Object {
  /** the glyph’s advance width */
  var advanceWidth: Double = js.native
  /** the glyph’s bounding box, i.e. the rectangle that encloses the glyph outline as tightly as possible. */
  var bbox: BBOX = js.native
  /**
    * The glyph’s control box.
    * This is often the same as the bounding box, but is faster to compute.
    * Because of the way bezier curves are defined, some of the control points
    * can be outside of the bounding box. Where `bbox` takes this into account,
    * `cbox` does not. Thus, cbox is less accurate, but faster to compute.
    * See [here](http://www.freetype.org/freetype2/docs/glyphs/glyphs-6.html#section-2)
    * for a more detailed description.
    */
  var cbox: BBOX = js.native
  /**
    * An array of unicode code points that are represented by this glyph.
    * There can be multiple code points in the case of ligatures and other glyphs
    * that represent multiple visual characters.
    */
  var codePoints: js.Array[Double] = js.native
  /** the glyph id in the font */
  var id: Double = js.native
  /** is a ligature glyph (multiple character, spacing glyph) */
  var isLigature: Boolean = js.native
  /** is a mark glyph (non-spacing combining glyph) */
  var isMark: Boolean = js.native
  /** a vector Path object representing the glyph */
  var path: Path = js.native
}

object Glyph {
  @scala.inline
  def apply(
    advanceWidth: Double,
    bbox: BBOX,
    cbox: BBOX,
    codePoints: js.Array[Double],
    id: Double,
    isLigature: Boolean,
    isMark: Boolean,
    path: Path
  ): Glyph = {
    val __obj = js.Dynamic.literal(advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], cbox = cbox.asInstanceOf[js.Any], codePoints = codePoints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLigature = isLigature.asInstanceOf[js.Any], isMark = isMark.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: BBOX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCbox(value: BBOX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodePoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLigature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLigature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

