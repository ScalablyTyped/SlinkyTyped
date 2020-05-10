package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuOpenOnClick extends js.Object {
  var rootMenuItems: js.UndefOr[Boolean] = js.native
  var subMenuItems: js.UndefOr[Boolean] = js.native
}

object MenuOpenOnClick {
  @scala.inline
  def apply(): MenuOpenOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOpenOnClick]
  }
  @scala.inline
  implicit class MenuOpenOnClickOps[Self <: MenuOpenOnClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootMenuItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuItems")(js.undefined)
        ret
    }
  }
  
}

