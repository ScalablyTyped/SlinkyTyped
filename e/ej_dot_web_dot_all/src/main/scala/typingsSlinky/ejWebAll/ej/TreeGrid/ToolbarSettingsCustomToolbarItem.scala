package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettingsCustomToolbarItem extends js.Object {
  /** Allows the user to insert the custom icons in toolbar using script templates. Using this property we can bind HTML elements and other EJ controls to TreeGrid toolbar.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Allows the user to insert the custom icons in toolbar using CSS class name selector.
    */
  var text: js.UndefOr[String] = js.native
  /** Allows the user to display custom tooltip text for TreeGrid custom toolbar items.
    */
  var tooltipText: js.UndefOr[String] = js.native
}

object ToolbarSettingsCustomToolbarItem {
  @scala.inline
  def apply(): ToolbarSettingsCustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
  }
  @scala.inline
  implicit class ToolbarSettingsCustomToolbarItemOps[Self <: ToolbarSettingsCustomToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(js.undefined)
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
    @scala.inline
    def withTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipText")(js.undefined)
        ret
    }
  }
  
}

