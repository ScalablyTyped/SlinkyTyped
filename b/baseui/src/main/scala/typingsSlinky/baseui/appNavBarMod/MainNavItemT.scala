package typingsSlinky.baseui.appNavBarMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainNavItemT extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactComponentClass[_]] = js.native
  var item: ItemT = js.native
  var mapItemToNode: js.UndefOr[typingsSlinky.baseui.appNavBarMod.mapItemToNode] = js.native
  var mapItemToString: typingsSlinky.baseui.appNavBarMod.mapItemToString = js.native
  var nav: js.UndefOr[js.Array[MainNavItemT]] = js.native
  var navExitIcon: js.UndefOr[ReactComponentClass[_]] = js.native
}

object MainNavItemT {
  @scala.inline
  def apply(item: ItemT, mapItemToString: /* item */ ItemT => String): MainNavItemT = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], mapItemToString = js.Any.fromFunction1(mapItemToString))
    __obj.asInstanceOf[MainNavItemT]
  }
  @scala.inline
  implicit class MainNavItemTOps[Self <: MainNavItemT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItem(value: ItemT): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapItemToString(value: /* item */ ItemT => String): Self = this.set("mapItemToString", js.Any.fromFunction1(value))
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setIconFunctionComponent(value: ReactComponentClass[_]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconComponentClass(value: ReactComponentClass[_]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: ReactComponentClass[_]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMapItemToNode(value: /* item */ ItemT => ReactElement): Self = this.set("mapItemToNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapItemToNode: Self = this.set("mapItemToNode", js.undefined)
    @scala.inline
    def setNavVarargs(value: MainNavItemT*): Self = this.set("nav", js.Array(value :_*))
    @scala.inline
    def setNav(value: js.Array[MainNavItemT]): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    @scala.inline
    def setNavExitIconFunctionComponent(value: ReactComponentClass[_]): Self = this.set("navExitIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavExitIconComponentClass(value: ReactComponentClass[_]): Self = this.set("navExitIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavExitIcon(value: ReactComponentClass[_]): Self = this.set("navExitIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavExitIcon: Self = this.set("navExitIcon", js.undefined)
  }
  
}

