package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.GIF
import typingsSlinky.devextreme.devextremeStrings.JPEG
import typingsSlinky.devextreme.devextremeStrings.PDF
import typingsSlinky.devextreme.devextremeStrings.PNG
import typingsSlinky.devextreme.devextremeStrings.SVG
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileName extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var fileName: js.UndefOr[String] = js.native
  var format: js.UndefOr[GIF | JPEG | PDF | PNG | SVG] = js.native
  var gridLayout: js.UndefOr[Boolean] = js.native
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  var margin: js.UndefOr[Double] = js.native
  var onExported: js.UndefOr[js.Function] = js.native
  var onExporting: js.UndefOr[js.Function] = js.native
  var onFileSaving: js.UndefOr[js.Function] = js.native
  var proxyUrl: js.UndefOr[String] = js.native
  var svgToCanvas: js.UndefOr[js.Function] = js.native
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.native
}

object FileName {
  @scala.inline
  def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  @scala.inline
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
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
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: GIF | JPEG | PDF | PNG | SVG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExported(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExporting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileSaving(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFileSaving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgToCanvas(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgToCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgToCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgToCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: bottom | center | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

