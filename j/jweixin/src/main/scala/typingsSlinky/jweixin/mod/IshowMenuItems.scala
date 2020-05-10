package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IshowMenuItems extends BaseParams {
  var menuList: typingsSlinky.jweixin.mod.menuList = js.native
}

object IshowMenuItems {
  @scala.inline
  def apply(menuList: menuList): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IshowMenuItems]
  }
  @scala.inline
  implicit class IshowMenuItemsOps[Self <: IshowMenuItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuList(value: menuList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

