package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartAxisFormat extends Entity {
  // Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.native
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.native
}

object WorkbookChartAxisFormat {
  @scala.inline
  def apply(): WorkbookChartAxisFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisFormat]
  }
  @scala.inline
  implicit class WorkbookChartAxisFormatOps[Self <: WorkbookChartAxisFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: WorkbookChartFont): Self = {
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
    def withLine(value: WorkbookChartLineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
  }
  
}

