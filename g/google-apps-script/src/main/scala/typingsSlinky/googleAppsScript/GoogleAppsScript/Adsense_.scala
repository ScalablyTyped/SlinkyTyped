package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.AccountsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdclientsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdunitsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.AlertsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.CustomchannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.MetadataCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.PaymentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.ReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.SavedadstylesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.UrlchannelsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adsense_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var Adclients: js.UndefOr[AdclientsCollection] = js.native
  var Adunits: js.UndefOr[AdunitsCollection] = js.native
  var Alerts: js.UndefOr[AlertsCollection] = js.native
  var Customchannels: js.UndefOr[CustomchannelsCollection] = js.native
  var Metadata: js.UndefOr[MetadataCollection] = js.native
  var Payments: js.UndefOr[PaymentsCollection] = js.native
  var Reports: js.UndefOr[ReportsCollection] = js.native
  var Savedadstyles: js.UndefOr[SavedadstylesCollection] = js.native
  var Urlchannels: js.UndefOr[UrlchannelsCollection] = js.native
}

object Adsense_ {
  @scala.inline
  def apply(): Adsense_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adsense_]
  }
  @scala.inline
  implicit class Adsense_Ops[Self <: Adsense_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: AccountsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withAdclients(value: AdclientsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdclients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adclients")(js.undefined)
        ret
    }
    @scala.inline
    def withAdunits(value: AdunitsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adunits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdunits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adunits")(js.undefined)
        ret
    }
    @scala.inline
    def withAlerts(value: AlertsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alerts")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomchannels(value: CustomchannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customchannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomchannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customchannels")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPayments(value: PaymentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payments")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: ReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedadstyles(value: SavedadstylesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Savedadstyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedadstyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Savedadstyles")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlchannels(value: UrlchannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urlchannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlchannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urlchannels")(js.undefined)
        ret
    }
  }
  
}

