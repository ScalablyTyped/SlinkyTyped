package typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus

import typingsSlinky.phosphorWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a TabSpace status item.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A menu to open when clicking on the status item. This should allow
    * the user to make a different selection about tabs/spaces.
    */
  var menu: Menu = js.native
}

object IOptions {
  @scala.inline
  def apply(menu: Menu): IOptions = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenu(value: Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

