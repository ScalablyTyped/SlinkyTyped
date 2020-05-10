package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettingsCustomToolbarItem extends js.Object {
  /** Gets or sets a value that indicates whether to add custom toolbar item as a template element.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to add custom toolbar item with a custom tooltip.
    */
  var tooltip: js.UndefOr[String] = js.native
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
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

