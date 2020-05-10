package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapGridBaseEventMap extends ControlEventMap {
  var toolbarItemClick: GridToolbarItemClickEventArgs = js.native
}

object BootstrapGridBaseEventMap {
  @scala.inline
  def apply(init: EventArgs, toolbarItemClick: GridToolbarItemClickEventArgs): BootstrapGridBaseEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridBaseEventMap]
  }
  @scala.inline
  implicit class BootstrapGridBaseEventMapOps[Self <: BootstrapGridBaseEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToolbarItemClick(value: GridToolbarItemClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItemClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

