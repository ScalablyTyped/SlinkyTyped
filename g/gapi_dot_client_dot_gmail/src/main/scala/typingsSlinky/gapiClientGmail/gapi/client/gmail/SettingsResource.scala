package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  var filters: FiltersResource = js.native
  var forwardingAddresses: ForwardingAddressesResource = js.native
  var sendAs: SendAsResource = js.native
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: AnonAlt): Request_[AutoForwarding] = js.native
  /** Gets IMAP settings. */
  def getImap(request: AnonAlt): Request_[ImapSettings] = js.native
  /** Gets POP settings. */
  def getPop(request: AnonAlt): Request_[PopSettings] = js.native
  /** Gets vacation responder settings. */
  def getVacation(request: AnonAlt): Request_[VacationSettings] = js.native
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: AnonAlt): Request_[AutoForwarding] = js.native
  /** Updates IMAP settings. */
  def updateImap(request: AnonAlt): Request_[ImapSettings] = js.native
  /** Updates POP settings. */
  def updatePop(request: AnonAlt): Request_[PopSettings] = js.native
  /** Updates vacation responder settings. */
  def updateVacation(request: AnonAlt): Request_[VacationSettings] = js.native
}

object SettingsResource {
  @scala.inline
  def apply(
    filters: FiltersResource,
    forwardingAddresses: ForwardingAddressesResource,
    getAutoForwarding: AnonAlt => Request_[AutoForwarding],
    getImap: AnonAlt => Request_[ImapSettings],
    getPop: AnonAlt => Request_[PopSettings],
    getVacation: AnonAlt => Request_[VacationSettings],
    sendAs: SendAsResource,
    updateAutoForwarding: AnonAlt => Request_[AutoForwarding],
    updateImap: AnonAlt => Request_[ImapSettings],
    updatePop: AnonAlt => Request_[PopSettings],
    updateVacation: AnonAlt => Request_[VacationSettings]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], forwardingAddresses = forwardingAddresses.asInstanceOf[js.Any], getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), sendAs = sendAs.asInstanceOf[js.Any], updateAutoForwarding = js.Any.fromFunction1(updateAutoForwarding), updateImap = js.Any.fromFunction1(updateImap), updatePop = js.Any.fromFunction1(updatePop), updateVacation = js.Any.fromFunction1(updateVacation))
    __obj.asInstanceOf[SettingsResource]
  }
  @scala.inline
  implicit class SettingsResourceOps[Self <: SettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: FiltersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardingAddresses(value: ForwardingAddressesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAutoForwarding(value: AnonAlt => Request_[AutoForwarding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoForwarding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImap(value: AnonAlt => Request_[ImapSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPop(value: AnonAlt => Request_[PopSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVacation(value: AnonAlt => Request_[VacationSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVacation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendAs(value: SendAsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAutoForwarding(value: AnonAlt => Request_[AutoForwarding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAutoForwarding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateImap(value: AnonAlt => Request_[ImapSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdatePop(value: AnonAlt => Request_[PopSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateVacation(value: AnonAlt => Request_[VacationSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateVacation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

