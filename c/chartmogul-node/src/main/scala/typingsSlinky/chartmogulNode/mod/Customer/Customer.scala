package typingsSlinky.chartmogulNode.mod.Customer

import typingsSlinky.chartmogulNode.anon.Addresszip
import typingsSlinky.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends js.Object {
  var address: js.UndefOr[Addresszip] = js.native
  var arr: js.UndefOr[Double] = js.native
  var attributes: js.UndefOr[Attributes_] = js.native
  var `billing-system-type`: js.UndefOr[String] = js.native
  var `billing-system-url`: js.UndefOr[String] = js.native
  var `chartmogul-url`: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var company: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var `currency-sign`: js.UndefOr[String] = js.native
  var `customer-since`: js.UndefOr[String] = js.native
  var data_source_uuid: js.UndefOr[String] = js.native
  var data_source_uuids: js.UndefOr[Strings] = js.native
  var email: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var external_ids: js.UndefOr[Strings] = js.native
  var free_trial_started_at: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var lead_created_at: js.UndefOr[String] = js.native
  var mrr: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var uuid: js.UndefOr[String] = js.native
  var zip: js.UndefOr[String] = js.native
}

object Customer {
  @scala.inline
  def apply(): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: typingsSlinky.chartmogulNode.mod.Customer.Customer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Addresszip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withArr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arr")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: Attributes_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withBilling-system-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-system-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBilling-system-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-system-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withBilling-system-url`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-system-url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBilling-system-url`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-system-url")(js.undefined)
        ret
    }
    @scala.inline
    def `withChartmogul-url`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartmogul-url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChartmogul-url`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartmogul-url")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def `withCurrency-sign`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency-sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCurrency-sign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency-sign")(js.undefined)
        ret
    }
    @scala.inline
    def `withCustomer-since`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer-since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCustomer-since`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer-since")(js.undefined)
        ret
    }
    @scala.inline
    def withData_source_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_source_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withData_source_uuids(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_source_uuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuids")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_ids(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withFree_trial_started_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free_trial_started_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFree_trial_started_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free_trial_started_at")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLead_created_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead_created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLead_created_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead_created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withMrr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMrr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

