package typingsSlinky.reactPdf.pageMod

import typingsSlinky.reactPdf.reactPdfNumbers.`0`
import typingsSlinky.reactPdf.reactPdfNumbers.`180`
import typingsSlinky.reactPdf.reactPdfNumbers.`270`
import typingsSlinky.reactPdf.reactPdfNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextLayerItemInternal extends js.Object {
  var fontName: String = js.native
  var itemIndex: Double = js.native
  var page: PDFPageItem = js.native
  var rotate: js.UndefOr[`0` | `90` | `180` | `270`] = js.native
  var scale: js.UndefOr[Double] = js.native
  var str: String = js.native
  var transform: js.Array[Double] = js.native
  var width: Double = js.native
}

object TextLayerItemInternal {
  @scala.inline
  def apply(
    fontName: String,
    itemIndex: Double,
    page: PDFPageItem,
    str: String,
    transform: js.Array[Double],
    width: Double
  ): TextLayerItemInternal = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayerItemInternal]
  }
  @scala.inline
  implicit class TextLayerItemInternalOps[Self <: TextLayerItemInternal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: PDFPageItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: `0` | `90` | `180` | `270`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

