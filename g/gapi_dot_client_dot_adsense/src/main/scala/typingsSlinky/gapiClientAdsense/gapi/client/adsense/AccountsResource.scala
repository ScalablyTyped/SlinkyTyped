package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.Alt
import typingsSlinky.gapiClientAdsense.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var adunits: AdunitsResource = js.native
  var alerts: AlertsResource = js.native
  var customchannels: CustomchannelsResource = js.native
  var payments: PaymentsResource = js.native
  var reports: ReportsResource = js.native
  var savedadstyles: SavedadstylesResource = js.native
  var urlchannels: UrlchannelsResource = js.native
  /** Get information about the selected AdSense account. */
  def get(request: Tree): Request[Account] = js.native
  /** List all accounts available to this AdSense account. */
  def list(request: Alt): Request[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: Tree => Request[Account],
    list: Alt => Request[Accounts],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), payments = payments.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], savedadstyles = savedadstyles.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
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
    def withAdunits(value: AdunitsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adunits")(value.asInstanceOf[js.Any])
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
    def withGet(value: Tree => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[Accounts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPayments(value: PaymentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReports(value: ReportsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedadstyles(value: SavedadstylesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedadstyles")(value.asInstanceOf[js.Any])
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

