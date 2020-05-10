package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Fires when user click on toolbar item in the toolbar.
    * @Default {empty}
    */
  var click: js.UndefOr[String] = js.native
  /** Add the custom icon groups to the toolbar.
    * @Default {empty}
    */
  var customGroups: js.UndefOr[js.Array[_]] = js.native
  /** Add the custom icon item to the toolbar.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the toolbar items.
    * @Default {ej.ReportViewer.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | String] = js.native
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Shows or hides the tooltip of toolbar items.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the toolbar template ID.
    * @Default {empty}
    */
  var templateId: js.UndefOr[String] = js.native
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
    def withClick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomGroups(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: ToolbarItems | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

