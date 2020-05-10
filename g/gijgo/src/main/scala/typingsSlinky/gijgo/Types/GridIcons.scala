package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridIcons extends js.Object {
  var collapseGroup: js.UndefOr[String] = js.native
  var collapseRow: js.UndefOr[String] = js.native
  var expandGroup: js.UndefOr[String] = js.native
  var expandRow: js.UndefOr[String] = js.native
}

object GridIcons {
  @scala.inline
  def apply(): GridIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridIcons]
  }
  @scala.inline
  implicit class GridIconsOps[Self <: GridIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRow")(js.undefined)
        ret
    }
  }
  
}

