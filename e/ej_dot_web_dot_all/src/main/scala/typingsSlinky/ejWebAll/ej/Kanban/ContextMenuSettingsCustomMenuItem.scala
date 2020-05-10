package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettingsCustomMenuItem extends js.Object {
  /** Its sets target element to custom context menu item.
    * @Default {ej.Kanban.Target.All}
    */
  var target: js.UndefOr[Target | String] = js.native
  /** Gets the template to render custom context menu item.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Gets the display name to custom menu item.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}

object ContextMenuSettingsCustomMenuItem {
  @scala.inline
  def apply(): ContextMenuSettingsCustomMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
  }
  @scala.inline
  implicit class ContextMenuSettingsCustomMenuItemOps[Self <: ContextMenuSettingsCustomMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: Target | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

