package typingsSlinky.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`100`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`200`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`300`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`400`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`500`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`600`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`700`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`800`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`900`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`line-through`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.`underline line-through`
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.bold
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.italic
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.none
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.normal
import typingsSlinky.prismReactRenderer.prismReactRendererStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismThemeEntry extends /* styleKey */ StringDictionary[String | Double | Unit] {
  var backgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[normal | italic] = js.native
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.native
}

object PrismThemeEntry {
  @scala.inline
  def apply(): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismThemeEntry]
  }
  @scala.inline
  implicit class PrismThemeEntryOps[Self <: PrismThemeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: normal | italic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(js.undefined)
        ret
    }
  }
  
}

