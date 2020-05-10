package typingsSlinky.angularGridster.mod.angularAugmentingMod.gridster

import typingsSlinky.angularGridster.AnonDrag
import typingsSlinky.angularGridster.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterConfig extends js.Object {
  // width of grid columns. "auto" will divide the width of the grid evenly among the columns
  var colWidth: js.UndefOr[String] = js.native
  // number of columns in the grid
  var columns: js.UndefOr[Double] = js.native
  // default width of an item in columns
  var defaultSizeX: js.UndefOr[Double] = js.native
  // default height of an item in rows
  var defaultSizeY: js.UndefOr[Double] = js.native
  // options to pass to draggable handler
  var draggable: js.UndefOr[AnonDrag] = js.native
  // whether to automatically float items up so they stack
  var floating: js.UndefOr[Boolean] = js.native
  // toggle mobile view
  var isMobile: js.UndefOr[Boolean] = js.native
  // margins in between grid items
  var margins: js.UndefOr[js.Array[Double]] = js.native
  // maximum amount of rows in the grid
  var maxRows: js.UndefOr[Double] = js.native
  // maximum column width of an item
  var maxSizeX: js.UndefOr[Double] = js.native
  // maximum row height of an item
  var maxSizeY: js.UndefOr[Double] = js.native
  // minimum amount of columns the grid can scale down to
  var minColumns: js.UndefOr[Double] = js.native
  // minimum amount of rows to show if the grid is empty
  var minRows: js.UndefOr[Double] = js.native
  // minimum column width of an item
  var minSizeX: js.UndefOr[Double] = js.native
  // minumum row height of an item
  var minSizeY: js.UndefOr[Double] = js.native
  // width threshold to toggle mobile mode
  var mobileBreakPoint: js.UndefOr[Double] = js.native
  // whether or not to toggle mobile mode when screen width is less than mobileBreakPoint
  var mobileModeEnabled: js.UndefOr[Boolean] = js.native
  // whether to set the outer margin
  var outerMargin: js.UndefOr[Boolean] = js.native
  // whether to push other items out of the way
  // whether to push other items out of the way
  var pushing: js.UndefOr[Boolean] = js.native
  // grid item height in mobile display. true- to use the calculated height by sizeY given
  // options to pass to resizable handler
  var resizable: js.UndefOr[AnonEnabled] = js.native
  // height of grid rows. 'match' will make it the same as the column width, a numeric value will be interpreted as pixels,
  // '/2' is half the column width, '*5' is five times the column width, etc.
  var rowHeight: js.UndefOr[String] = js.native
  var saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.native
  // whether or not to have items switch places instead of push down if they are the same size
  var swapping: js.UndefOr[Boolean] = js.native
  // width of the grid. "auto" will expand the grid to its parent container
  var width: js.UndefOr[String] = js.native
}

object GridsterConfig {
  @scala.inline
  def apply(): GridsterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterConfig]
  }
  @scala.inline
  implicit class GridsterConfigOps[Self <: GridsterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSizeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSizeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizeX")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSizeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSizeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSizeY")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: AnonDrag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withMargins(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSizeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSizeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSizeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSizeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeY")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileBreakPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBreakPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileBreakPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileBreakPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileModeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileModeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileModeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileModeEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withPushing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushing")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveGridItemCalculatedHeightInMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveGridItemCalculatedHeightInMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveGridItemCalculatedHeightInMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveGridItemCalculatedHeightInMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapping")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

