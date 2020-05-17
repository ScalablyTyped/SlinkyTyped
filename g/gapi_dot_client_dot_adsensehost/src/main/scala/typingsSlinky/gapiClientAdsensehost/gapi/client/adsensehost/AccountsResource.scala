package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.FilterAdClientId
import typingsSlinky.gapiClientAdsensehost.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var adunits: AdunitsResource = js.native
  var reports: ReportsResource = js.native
  /** Get information about the selected associated AdSense account. */
  def get(request: Key): Request[Account] = js.native
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: FilterAdClientId): Request[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    get: Key => Request[Account],
    list: FilterAdClientId => Request[Accounts],
    reports: ReportsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
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
    def withGet(value: Key => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: FilterAdClientId => Request[Accounts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReports(value: ReportsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

