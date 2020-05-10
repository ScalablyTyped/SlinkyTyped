package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.DelegatesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.FiltersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.ForwardingAddressesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCollection extends js.Object {
  var Delegates: js.UndefOr[DelegatesCollection] = js.native
  var Filters: js.UndefOr[FiltersCollection] = js.native
  var ForwardingAddresses: js.UndefOr[ForwardingAddressesCollection] = js.native
  var SendAs: js.UndefOr[SendAsCollection] = js.native
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: String): AutoForwarding = js.native
  // Gets IMAP settings.
  def getImap(userId: String): ImapSettings = js.native
  // Gets POP settings.
  def getPop(userId: String): PopSettings = js.native
  // Gets vacation responder settings.
  def getVacation(userId: String): VacationSettings = js.native
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(resource: AutoForwarding, userId: String): AutoForwarding = js.native
  // Updates IMAP settings.
  def updateImap(resource: ImapSettings, userId: String): ImapSettings = js.native
  // Updates POP settings.
  def updatePop(resource: PopSettings, userId: String): PopSettings = js.native
  // Updates vacation responder settings.
  def updateVacation(resource: VacationSettings, userId: String): VacationSettings = js.native
}

object SettingsCollection {
  @scala.inline
  def apply(
    getAutoForwarding: String => AutoForwarding,
    getImap: String => ImapSettings,
    getPop: String => PopSettings,
    getVacation: String => VacationSettings,
    updateAutoForwarding: (AutoForwarding, String) => AutoForwarding,
    updateImap: (ImapSettings, String) => ImapSettings,
    updatePop: (PopSettings, String) => PopSettings,
    updateVacation: (VacationSettings, String) => VacationSettings
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
    __obj.asInstanceOf[SettingsCollection]
  }
  @scala.inline
  implicit class SettingsCollectionOps[Self <: SettingsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAutoForwarding(value: String => AutoForwarding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoForwarding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImap(value: String => ImapSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPop(value: String => PopSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVacation(value: String => VacationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVacation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAutoForwarding(value: (AutoForwarding, String) => AutoForwarding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAutoForwarding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateImap(value: (ImapSettings, String) => ImapSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdatePop(value: (PopSettings, String) => PopSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateVacation(value: (VacationSettings, String) => VacationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateVacation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelegates(value: DelegatesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delegates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delegates")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FiltersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardingAddresses(value: ForwardingAddressesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSendAs(value: SendAsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendAs")(js.undefined)
        ret
    }
  }
  
}

