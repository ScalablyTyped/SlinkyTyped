package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleStyleIcons extends js.Object {
  var sortAscendingIcon: js.UndefOr[js.Any] = js.native
  var sortDescendingIcon: js.UndefOr[js.Any] = js.native
}

object GriddleStyleIcons {
  @scala.inline
  def apply(): GriddleStyleIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleIcons]
  }
  @scala.inline
  implicit class GriddleStyleIconsOps[Self <: GriddleStyleIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortAscendingIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscendingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscendingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscendingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDescendingIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescendingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDescendingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescendingIcon")(js.undefined)
        ret
    }
  }
  
}

