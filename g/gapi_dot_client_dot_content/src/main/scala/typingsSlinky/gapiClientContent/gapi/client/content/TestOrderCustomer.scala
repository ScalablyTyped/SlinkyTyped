package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrderCustomer extends js.Object {
  /** Email address of the customer. */
  var email: js.UndefOr[String] = js.native
  /**
    * If set, this indicates the user explicitly chose to opt in or out of providing marketing rights to the merchant. If unset, this indicates the user has
    * already made this choice in a previous purchase, and was thus not shown the marketing right opt in/out checkbox during the checkout flow. Optional.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  /** Full name of the customer. */
  var fullName: js.UndefOr[String] = js.native
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
  }
  
}

