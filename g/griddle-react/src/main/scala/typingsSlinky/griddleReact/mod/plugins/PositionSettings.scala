package typingsSlinky.griddleReact.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionSettings extends js.Object {
  // TODO: Unused?
  // The minimum column width
  var defaultColumnWidth: js.UndefOr[Double | String] = js.native
  // TODO: Unused?
  // Disable pointer events while scrolling to improve performance
  var disablePointerEvents: js.UndefOr[Boolean] = js.native
  // TODO: Unused?
  // Whether or not the header should be fixed
  var fixedHeader: js.UndefOr[Boolean] = js.native
  // The minimum row height
  var rowHeight: js.UndefOr[Double | String] = js.native
  // The height of the table
  var tableHeight: js.UndefOr[Double | String] = js.native
  // The width of the table
  var tableWidth: js.UndefOr[Double | String] = js.native
}

object PositionSettings {
  @scala.inline
  def apply(): PositionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionSettings]
  }
  @scala.inline
  implicit class PositionSettingsOps[Self <: PositionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultColumnWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePointerEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double | String): Self = {
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
    def withTableHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTableWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWidth")(js.undefined)
        ret
    }
  }
  
}

