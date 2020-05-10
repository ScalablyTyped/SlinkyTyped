package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrderCustomer extends js.Object {
  var email: js.UndefOr[String] = js.native
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  var fullName: js.UndefOr[String] = js.native
  var marketingRightsInfo: js.UndefOr[TestOrderCustomerMarketingRightsInfo] = js.native
}

object TestOrderCustomer {
  @scala.inline
  def apply(): TestOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderCustomer]
  }
  @scala.inline
  implicit class TestOrderCustomerOps[Self <: TestOrderCustomer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExplicitMarketingPreference(value: Boolean): Self = {
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
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketingRightsInfo(value: TestOrderCustomerMarketingRightsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingRightsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketingRightsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingRightsInfo")(js.undefined)
        ret
    }
  }
  
}

