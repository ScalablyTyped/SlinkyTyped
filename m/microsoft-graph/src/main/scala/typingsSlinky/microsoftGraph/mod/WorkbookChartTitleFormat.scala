package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartTitleFormat extends Entity {
  // Represents the fill format of an object, which includes background formatting information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.native
  // Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.native
}

object WorkbookChartTitleFormat {
  @scala.inline
  def apply(): WorkbookChartTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartTitleFormat]
  }
  @scala.inline
  implicit class WorkbookChartTitleFormatOps[Self <: WorkbookChartTitleFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: WorkbookChartFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
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

