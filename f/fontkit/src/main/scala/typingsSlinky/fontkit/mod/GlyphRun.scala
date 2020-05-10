package typingsSlinky.fontkit.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlyphRun extends js.Object {
  /**
    * The total advance height of the run.
    */
  var advanceHeight: Double = js.native
  /**
    * The total advance width of the run.
    */
  var advanceWidth: Double = js.native
  /**
    * The bounding box containing all glyphs in the run.
    */
  var bbox: BBOX = js.native
  /**
    * The direction requested for shaping, as passed in (either ltr or rtl).
    * If `null`, the default direction of the script is used.
    */
  var direction: String = js.native
  /**
    * The features requested during shaping. This is a combination of user
    * specified features and features chosen by the shaper.
    */
  var features: Record[String, Boolean] = js.native
  /**
    * An array of Glyph objects in the run
    */
  var glyphs: js.Array[Glyph] = js.native
  /**
    * The language requested for shaping, as passed in. If `null`, the default language for the
    * script was used.
    */
  var language: String = js.native
  /**
    * An array of GlyphPosition objects for each glyph in the run
    */
  var positions: js.Array[GlyphPosition] = js.native
  /**
    * The script that was requested for shaping. This was either passed in or detected automatically.
    */
  var script: String = js.native
}

object GlyphRun {
  @scala.inline
  def apply(
    advanceHeight: Double,
    advanceWidth: Double,
    bbox: BBOX,
    direction: String,
    features: Record[String, Boolean],
    glyphs: js.Array[Glyph],
    language: String,
    positions: js.Array[GlyphPosition],
    script: String
  ): GlyphRun = {
    val __obj = js.Dynamic.literal(advanceHeight = advanceHeight.asInstanceOf[js.Any], advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphRun]
  }
  @scala.inline
  implicit class GlyphRunOps[Self <: GlyphRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceHeight")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: Record[String, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphs(value: js.Array[Glyph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[GlyphPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

