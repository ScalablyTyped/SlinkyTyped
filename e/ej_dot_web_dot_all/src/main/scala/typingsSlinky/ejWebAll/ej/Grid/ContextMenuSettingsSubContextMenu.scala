package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettingsSubContextMenu extends js.Object {
  /** Used to get or set the corresponding custom context menu item to which the submenu to be appended.
    * @Default {null}
    */
  var contextMenuItem: js.UndefOr[String] = js.native
  /** Used to get or set the sub menu items to the custom context menu item.
    * @Default {[]}
    */
  var subMenu: js.UndefOr[js.Array[_]] = js.native
  /** Used to get or set the sub menu items to the custom context menu item using JsRender template.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
}

object ContextMenuSettingsSubContextMenu {
  @scala.inline
  def apply(): ContextMenuSettingsSubContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsSubContextMenu]
  }
  @scala.inline
  implicit class ContextMenuSettingsSubContextMenuOps[Self <: ContextMenuSettingsSubContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextMenuItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenu(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

