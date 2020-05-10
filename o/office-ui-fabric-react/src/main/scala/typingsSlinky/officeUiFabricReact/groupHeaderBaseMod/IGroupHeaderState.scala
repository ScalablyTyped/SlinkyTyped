package typingsSlinky.officeUiFabricReact.groupHeaderBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupHeaderState extends js.Object {
  var isCollapsed: Boolean = js.native
  var isLoadingVisible: Boolean = js.native
}

object IGroupHeaderState {
  @scala.inline
  def apply(isCollapsed: Boolean, isLoadingVisible: Boolean): IGroupHeaderState = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isLoadingVisible = isLoadingVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderState]
  }
  @scala.inline
  implicit class IGroupHeaderStateOps[Self <: IGroupHeaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoadingVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

