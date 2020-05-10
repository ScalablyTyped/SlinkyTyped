package typingsSlinky.reactBootstrap.glyphiconMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlyphiconProps
  extends AllHTMLAttributes[Glyphicon]
     with ClassAttributes[Glyphicon] {
  // Optional
  var bsClass: js.UndefOr[String] = js.native
  // Required
  var glyph: String = js.native
}

object GlyphiconProps {
  @scala.inline
  def apply(glyph: String): GlyphiconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphiconProps]
  }
  @scala.inline
  implicit class GlyphiconPropsOps[Self <: GlyphiconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlyph(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
  }
  
}

