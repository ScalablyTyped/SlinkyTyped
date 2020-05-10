package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Allows the user to insert custom toolbar items.
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.native
  /** Shows/hides the toolbar.
    * @Default {false}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Specifies the list of toolbar items to be rendered in TreeGrid toolbar
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItems | String]] = js.native
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
    def withToolbarItems(value: js.Array[ToolbarItems | String]): Self = {
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

