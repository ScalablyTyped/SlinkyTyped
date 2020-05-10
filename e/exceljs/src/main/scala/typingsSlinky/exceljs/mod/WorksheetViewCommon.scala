package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetViewCommon extends js.Object {
  /**
  	 * The currently selected cell
  	 */
  var activeCell: String = js.native
  /**
  	 * Sets the worksheet view's orientation to right-to-left, `false` by default
  	 */
  var rightToLeft: Boolean = js.native
  /**
  	 * Shows or hides the gridlines (shown for cells where borders have not been defined),
  	 * `true` by default
  	 */
  var showGridLines: Boolean = js.native
  /**
  	 * Shows or hides the row and column headers (e.g. A1, B1 at the top and 1,2,3 on the left,
  	 * `true` by default
  	 */
  var showRowColHeaders: Boolean = js.native
  /**
  	 * Shows or hides the ruler in Page Layout, `true` by default
  	 */
  var showRuler: Boolean = js.native
  /**
  	 * 	Percentage zoom to use for the view, `100` by default
  	 */
  var zoomScale: Double = js.native
  /**
  	 * 	Normal zoom for the view, `100` by default
  	 */
  var zoomScaleNormal: Double = js.native
}

object WorksheetViewCommon {
  @scala.inline
  def apply(
    activeCell: String,
    rightToLeft: Boolean,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    showRuler: Boolean,
    zoomScale: Double,
    zoomScaleNormal: Double
  ): WorksheetViewCommon = {
    val __obj = js.Dynamic.literal(activeCell = activeCell.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], showRuler = showRuler.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any], zoomScaleNormal = zoomScaleNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewCommon]
  }
  @scala.inline
  implicit class WorksheetViewCommonOps[Self <: WorksheetViewCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightToLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRowColHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowColHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomScaleNormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScaleNormal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

