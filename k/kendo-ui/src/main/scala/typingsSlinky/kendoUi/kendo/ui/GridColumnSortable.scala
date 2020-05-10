package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.native
  var compare: js.UndefOr[js.Function] = js.native
  var initialDirection: js.UndefOr[String] = js.native
}

object GridColumnSortable {
  @scala.inline
  def apply(): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnSortable]
  }
  @scala.inline
  implicit class GridColumnSortableOps[Self <: GridColumnSortable] (val x: Self) extends AnyVal {
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
    def withCompare(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
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
  }
  
}

