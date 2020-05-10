package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dijit.MenuBarItem.MenuBarItemMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMenuBarItem extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/MenuBarItem._MenuBarItemMixin.html
    *
    * 
    */
  var _MenuBarItemMixin: Instantiable0[MenuBarItemMixin] = js.native
}

object TypeofMenuBarItem {
  @scala.inline
  def apply(_MenuBarItemMixin: Instantiable0[MenuBarItemMixin]): TypeofMenuBarItem = {
    val __obj = js.Dynamic.literal(_MenuBarItemMixin = _MenuBarItemMixin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMenuBarItem]
  }
  @scala.inline
  implicit class TypeofMenuBarItemOps[Self <: TypeofMenuBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_MenuBarItemMixin(value: Instantiable0[MenuBarItemMixin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_MenuBarItemMixin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

