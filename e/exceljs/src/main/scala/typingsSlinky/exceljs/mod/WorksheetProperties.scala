package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetProperties extends js.Object {
  /**
  	 * Default column width (optional)
  	 */
  var defaultColWidth: js.UndefOr[Double] = js.native
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: Double = js.native
  /**
  	 * default: 55
  	 */
  var dyDescent: Double = js.native
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: Double = js.native
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: Double = js.native
  var showGridLines: Boolean = js.native
  /**
  	 * Color of the tab
  	 */
  var tabColor: PartialColor = js.native
}

object WorksheetProperties {
  @scala.inline
  def apply(
    defaultRowHeight: Double,
    dyDescent: Double,
    outlineLevelCol: Double,
    outlineLevelRow: Double,
    showGridLines: Boolean,
    tabColor: PartialColor
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], dyDescent = dyDescent.asInstanceOf[js.Any], outlineLevelCol = outlineLevelCol.asInstanceOf[js.Any], outlineLevelRow = outlineLevelRow.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], tabColor = tabColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProperties]
  }
  @scala.inline
  implicit class WorksheetPropertiesOps[Self <: WorksheetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDyDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dyDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineLevelCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineLevelRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabColor(value: PartialColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(js.undefined)
        ret
    }
  }
  
}

