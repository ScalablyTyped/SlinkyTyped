package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  var marketingEmailAddress: js.UndefOr[String] = js.native
}

object OrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(): OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerMarketingRightsInfo]
  }
  @scala.inline
  implicit class OrderCustomerMarketingRightsInfoOps[Self <: OrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitMarketingPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitMarketingPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitMarketingPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitMarketingPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketingEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketingEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingEmailAddress")(js.undefined)
        ret
    }
  }
  
}

