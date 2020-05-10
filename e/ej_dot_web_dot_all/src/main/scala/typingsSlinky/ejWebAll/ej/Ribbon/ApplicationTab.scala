package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationTab extends js.Object {
  /** Specifies the ribbon backstage page items.
    * @Default {Object}
    */
  var backstageSettings: js.UndefOr[ApplicationTabBackstageSettings] = js.native
  /** Specifies the ID of ul list to create application menu in the ribbon control.
    * @Default {null}
    */
  var menuItemID: js.UndefOr[String] = js.native
  /** Specifies the menu members, events by using the menu settings for the menu in the application tab.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the application menu or backstage page. Specify the type of application tab as &quot;ej.Ribbon.ApplicationTabType.Menu&quot; to render the application menu or
    * &quot;ej.Ribbon.ApplicationTabType.Backstage&quot; to render backstage page in the ribbon control.
    * @Default {ej.Ribbon.ApplicationTabType.Menu}
    */
  var `type`: js.UndefOr[ApplicationTabType | String] = js.native
}

object ApplicationTab {
  @scala.inline
  def apply(): ApplicationTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTab]
  }
  @scala.inline
  implicit class ApplicationTabOps[Self <: ApplicationTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackstageSettings(value: ApplicationTabBackstageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackstageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemID")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuSettings(value: js.Any): Self = {
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

