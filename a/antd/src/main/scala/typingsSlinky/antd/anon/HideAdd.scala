package typingsSlinky.antd.anon

import typingsSlinky.antd.tabsMod.TabsPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideAdd extends js.Object {
  var hideAdd: Boolean
  var tabPosition: TabsPosition
}

object HideAdd {
  @scala.inline
  def apply(hideAdd: Boolean, tabPosition: TabsPosition): HideAdd = {
    val __obj = js.Dynamic.literal(hideAdd = hideAdd.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideAdd]
  }
  @scala.inline
  implicit class HideAddOps[Self <: HideAdd] (val x: Self) extends AnyVal {
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
    def setHideAdd(value: Boolean): Self = this.set("hideAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabPosition(value: TabsPosition): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
  }
  
}

