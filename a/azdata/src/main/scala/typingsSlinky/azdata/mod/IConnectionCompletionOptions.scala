package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionCompletionOptions extends js.Object {
  /**
  		 * Save the connection to MRU and settings (only save to setting if profile.saveProfile is set to true)
  		 * Default is true.
  		 */
  var saveConnection: Boolean = js.native
  /**
  		 * If undefined / true, open the connection dialog if connection fails.
  		 * If false, connection dialog won't be opened even if connection fails.
  		 * Default is true.
  		 */
  var showConnectionDialogOnError: js.UndefOr[Boolean] = js.native
  /**
  		 * If true, open the dashboard after connection is complete.
  		 * If undefined / false, dashboard won't be opened after connection completes.
  		 * Default is false.
  		 */
  var showDashboard: js.UndefOr[Boolean] = js.native
  /**
  		 * If undefined / true, open the connection firewall rule dialog if connection fails.
  		 * If false, connection firewall rule dialog won't be opened even if connection fails.
  		 * Default is true.
  		 */
  var showFirewallRuleOnError: js.UndefOr[Boolean] = js.native
}

object IConnectionCompletionOptions {
  @scala.inline
  def apply(saveConnection: Boolean): IConnectionCompletionOptions = {
    val __obj = js.Dynamic.literal(saveConnection = saveConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCompletionOptions]
  }
  @scala.inline
  implicit class IConnectionCompletionOptionsOps[Self <: IConnectionCompletionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowConnectionDialogOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectionDialogOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConnectionDialogOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectionDialogOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDashboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDashboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDashboard")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirewallRuleOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirewallRuleOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirewallRuleOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirewallRuleOnError")(js.undefined)
        ret
    }
  }
  
}

