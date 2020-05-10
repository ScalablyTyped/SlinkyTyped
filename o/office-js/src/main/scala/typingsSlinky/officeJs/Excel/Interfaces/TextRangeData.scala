package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `textRange.toJSON()`. */
@js.native
trait TextRangeData extends js.Object {
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontData] = js.native
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.native
}

object TextRangeData {
  @scala.inline
  def apply(): TextRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeData]
  }
  @scala.inline
  implicit class TextRangeDataOps[Self <: TextRangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: ShapeFontData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

