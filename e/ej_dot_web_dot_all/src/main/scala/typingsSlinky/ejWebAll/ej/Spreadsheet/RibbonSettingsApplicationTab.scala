package typingsSlinky.ejWebAll.ej.Spreadsheet

import typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonSettingsApplicationTab extends js.Object {
  /** Gets or sets an object that indicates menu settings for application tab in Spreadsheet.
    */
  var menuSettings: js.UndefOr[RibbonSettingsApplicationTabMenuSettings] = js.native
  /** Gets or sets a value that indicates to set application tab type in Spreadsheet. It has two types, Menu and Backstage.
    * @Default {ej.Ribbon.ApplicationTabType.Backstage}
    */
  var `type`: js.UndefOr[ApplicationTabType | String] = js.native
}

object RibbonSettingsApplicationTab {
  @scala.inline
  def apply(): RibbonSettingsApplicationTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonSettingsApplicationTab]
  }
  @scala.inline
  implicit class RibbonSettingsApplicationTabOps[Self <: RibbonSettingsApplicationTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuSettings(value: RibbonSettingsApplicationTabMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ApplicationTabType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

