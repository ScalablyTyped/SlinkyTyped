package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IhideMenuItems extends BaseParams {
  var menuList: js.Array[menuProtected | menuShare] = js.native
}

object IhideMenuItems {
  @scala.inline
  def apply(menuList: js.Array[menuProtected | menuShare]): IhideMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IhideMenuItems]
  }
  @scala.inline
  implicit class IhideMenuItemsOps[Self <: IhideMenuItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuList(value: js.Array[menuProtected | menuShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

