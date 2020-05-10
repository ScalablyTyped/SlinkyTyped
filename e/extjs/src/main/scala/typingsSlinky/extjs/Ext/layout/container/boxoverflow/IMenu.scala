package typingsSlinky.extjs.Ext.layout.container.boxoverflow

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends IBase {
  /** [Property] (Array) */
  var menuItems: js.UndefOr[Array] = js.native
  /** [Property] (String) */
  var noItemsMenuText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var triggerButtonCls: js.UndefOr[String] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuItems(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNoItemsMenuText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noItemsMenuText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoItemsMenuText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noItemsMenuText")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerButtonCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerButtonCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerButtonCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerButtonCls")(js.undefined)
        ret
    }
  }
  
}

