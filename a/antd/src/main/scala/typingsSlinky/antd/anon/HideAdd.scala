package typingsSlinky.antd.anon

import typingsSlinky.antd.tabsMod.TabsPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideAdd extends js.Object {
  var hideAdd: Boolean = js.native
  var tabPosition: TabsPosition = js.native
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
    def withHideAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabPosition(value: TabsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

