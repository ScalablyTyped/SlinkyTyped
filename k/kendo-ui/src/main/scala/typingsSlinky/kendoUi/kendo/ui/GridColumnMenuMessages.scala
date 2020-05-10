package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnMenuMessages extends js.Object {
  var columns: js.UndefOr[String] = js.native
  var done: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var lock: js.UndefOr[String] = js.native
  var settings: js.UndefOr[String] = js.native
  var sortAscending: js.UndefOr[String] = js.native
  var sortDescending: js.UndefOr[String] = js.native
  var unlock: js.UndefOr[String] = js.native
}

object GridColumnMenuMessages {
  @scala.inline
  def apply(): GridColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenuMessages]
  }
  @scala.inline
  implicit class GridColumnMenuMessagesOps[Self <: GridColumnMenuMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
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
    def withDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAscending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDescending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescending")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.undefined)
        ret
    }
  }
  
}

