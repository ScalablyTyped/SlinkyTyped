package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Shows or hides the tooltip of the toolbar items.
    */
  var showToolTip: js.UndefOr[Boolean] = js.native
  /** Shows or hides the grouped items in the toolbar with the help of enum ej.PdfViewer.ToolbarItems
    */
  var toolbarItem: js.UndefOr[ToolbarItems | String] = js.native
}

object ToolbarSettings {
  @scala.inline
  def apply(): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettings]
  }
  @scala.inline
  implicit class ToolbarSettingsOps[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarItem(value: ToolbarItems | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItem")(js.undefined)
        ret
    }
  }
  
}

