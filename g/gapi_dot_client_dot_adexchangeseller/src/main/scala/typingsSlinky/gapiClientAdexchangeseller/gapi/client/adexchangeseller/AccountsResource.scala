package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangeseller.AnonKey
import typingsSlinky.gapiClientAdexchangeseller.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var alerts: AlertsResource = js.native
  var customchannels: CustomchannelsResource = js.native
  var metadata: MetadataResource = js.native
  var preferreddeals: PreferreddealsResource = js.native
  var reports: ReportsResource = js.native
  var urlchannels: UrlchannelsResource = js.native
  /** Get information about the selected Ad Exchange account. */
  def get(request: AnonKey): Request_[Account] = js.native
  /** List all accounts available to this Ad Exchange account. */
  def list(request: AnonMaxResults): Request_[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: AnonKey => Request_[Account],
    list: AnonMaxResults => Request_[Accounts],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), metadata = metadata.asInstanceOf[js.Any], preferreddeals = preferreddeals.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdclients(value: AdclientsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlerts(value: AlertsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomchannels(value: CustomchannelsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customchannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[Accounts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferreddeals(value: PreferreddealsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferreddeals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReports(value: ReportsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlchannels(value: UrlchannelsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlchannels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

