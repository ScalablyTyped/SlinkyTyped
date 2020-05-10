package typingsSlinky.leafletIconGlyph.mod.Icon_

import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlyphIconOptions extends IconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.native
  var bgSize: js.UndefOr[PointExpression] = js.native
  var glyph: js.UndefOr[String] = js.native
  var glyphAnchor: js.UndefOr[PointExpression] = js.native
  var glyphColor: js.UndefOr[String] = js.native
  var glyphSize: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object GlyphIconOptions {
  @scala.inline
  def apply(iconUrl: String): GlyphIconOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphIconOptions]
  }
  @scala.inline
  implicit class GlyphIconOptionsOps[Self <: GlyphIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgPos(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPos")(js.undefined)
        ret
    }
    @scala.inline
    def withBgSize(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphAnchor(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

