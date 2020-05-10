package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurePaneSettings extends js.Object {
  /** Shows or hides the grouped items in the configuration pane with the help of enum ej.ReportDesigner.ConfigureItems
    * @Default {ej.ReportDesigner.ConfigureItems.All}
    */
  var items: js.UndefOr[ConfigureItems | String] = js.native
  /** Shows or hides the configuration pane in ReportDesigner control.
    * @Default {true}
    */
  var showConfigurePane: js.UndefOr[Boolean] = js.native
}

object ConfigurePaneSettings {
  @scala.inline
  def apply(): ConfigurePaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurePaneSettings]
  }
  @scala.inline
  implicit class ConfigurePaneSettingsOps[Self <: ConfigurePaneSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: ConfigureItems | String): Self = {
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
    def withShowConfigurePane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfigurePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConfigurePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfigurePane")(js.undefined)
        ret
    }
  }
  
}

