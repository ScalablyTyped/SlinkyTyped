package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.native
  var initialDirection: js.UndefOr[String] = js.native
  var mode: js.UndefOr[String] = js.native
  var showIndexes: js.UndefOr[Boolean] = js.native
}

object GridSortable {
  @scala.inline
  def apply(): GridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSortable]
  }
  @scala.inline
  implicit class GridSortableOps[Self <: GridSortable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnsort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnsort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnsort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnsort")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndexes")(js.undefined)
        ret
    }
  }
  
}

