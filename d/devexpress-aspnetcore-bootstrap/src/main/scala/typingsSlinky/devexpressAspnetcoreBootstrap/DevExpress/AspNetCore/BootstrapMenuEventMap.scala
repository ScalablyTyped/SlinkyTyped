package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapMenuEventMap extends ControlEventMap {
  var closeUp: MenuItemEventArgs = js.native
  var itemClick: MenuItemClickEventArgs = js.native
  var itemMouseOut: MenuItemMouseEventArgs = js.native
  var itemMouseOver: MenuItemMouseEventArgs = js.native
  var popUp: MenuItemEventArgs = js.native
}

object BootstrapMenuEventMap {
  @scala.inline
  def apply(
    closeUp: MenuItemEventArgs,
    init: EventArgs,
    itemClick: MenuItemClickEventArgs,
    itemMouseOut: MenuItemMouseEventArgs,
    itemMouseOver: MenuItemMouseEventArgs,
    popUp: MenuItemEventArgs
  ): BootstrapMenuEventMap = {
    val __obj = js.Dynamic.literal(closeUp = closeUp.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any], itemMouseOut = itemMouseOut.asInstanceOf[js.Any], itemMouseOver = itemMouseOver.asInstanceOf[js.Any], popUp = popUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuEventMap]
  }
  @scala.inline
  implicit class BootstrapMenuEventMapOps[Self <: BootstrapMenuEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseUp(value: MenuItemEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemClick(value: MenuItemClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemMouseOut(value: MenuItemMouseEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemMouseOver(value: MenuItemMouseEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopUp(value: MenuItemEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

