package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMemberSettings extends js.Object {
  // If set to true, members can add and remove apps.
  var allowAddRemoveApps: js.UndefOr[Boolean] = js.native
  // If set to true, members can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[Boolean] = js.native
  // If set to true, members can add, update, and remove connectors.
  var allowCreateUpdateRemoveConnectors: js.UndefOr[Boolean] = js.native
  // If set to true, members can add, update, and remove tabs.
  var allowCreateUpdateRemoveTabs: js.UndefOr[Boolean] = js.native
  // If set to true, members can delete channels.
  var allowDeleteChannels: js.UndefOr[Boolean] = js.native
}

object TeamMemberSettings {
  @scala.inline
  def apply(): TeamMemberSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMemberSettings]
  }
  @scala.inline
  implicit class TeamMemberSettingsOps[Self <: TeamMemberSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAddRemoveApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddRemoveApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAddRemoveApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddRemoveApps")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCreateUpdateChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreateUpdateChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCreateUpdateRemoveConnectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateRemoveConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreateUpdateRemoveConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateRemoveConnectors")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCreateUpdateRemoveTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateRemoveTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreateUpdateRemoveTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateRemoveTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteChannels")(js.undefined)
        ret
    }
  }
  
}

