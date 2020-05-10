package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add custom toolbar items within the toolbar to perform any action in the grid
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.native
  /** Gets or sets a value that indicates whether to enable toolbar in the grid.
    * @Default {false}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add the default editing actions as a toolbar items. See toolbarItems.
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolBarItems | String]] = js.native
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
    def withCustomToolbarItems(value: js.Array[ToolbarSettingsCustomToolbarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomToolbarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarItems(value: js.Array[ToolBarItems | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(js.undefined)
        ret
    }
  }
  
}

