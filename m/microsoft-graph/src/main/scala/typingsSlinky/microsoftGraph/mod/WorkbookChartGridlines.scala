package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartGridlines extends Entity {
  // Represents the formatting of chart gridlines. Read-only.
  var format: js.UndefOr[WorkbookChartGridlinesFormat] = js.native
  // Boolean value representing if the axis gridlines are visible or not.
  var visible: js.UndefOr[Boolean] = js.native
}

object WorkbookChartGridlines {
  @scala.inline
  def apply(): WorkbookChartGridlines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlines]
  }
  @scala.inline
  implicit class WorkbookChartGridlinesOps[Self <: WorkbookChartGridlines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: WorkbookChartGridlinesFormat): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

