package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartAxisTitleFormat extends Entity {
  // Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.native
}

object WorkbookChartAxisTitleFormat {
  @scala.inline
  def apply(): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
  @scala.inline
  implicit class WorkbookChartAxisTitleFormatOps[Self <: WorkbookChartAxisTitleFormat] (val x: Self) extends AnyVal {
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
  }
  
}

