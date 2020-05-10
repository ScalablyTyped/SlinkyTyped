package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSettings extends Entity {
  var contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[Boolean] = js.native
  var contributionToContentDiscoveryDisabled: js.UndefOr[Boolean] = js.native
}

object UserSettings {
  @scala.inline
  def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributionToContentDiscoveryAsOrganizationDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionToContentDiscoveryAsOrganizationDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributionToContentDiscoveryAsOrganizationDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionToContentDiscoveryAsOrganizationDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withContributionToContentDiscoveryDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionToContentDiscoveryDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributionToContentDiscoveryDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionToContentDiscoveryDisabled")(js.undefined)
        ret
    }
  }
  
}

