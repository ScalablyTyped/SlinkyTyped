package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderCustomer extends js.Object {
  /**
    * Deprecated.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use marketingRightsInfo instead.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * Customer&#39;s marketing preferences.
    */
  var marketingRightsInfo: js.UndefOr[SchemaOrderCustomerMarketingRightsInfo] = js.native
}

object SchemaOrderCustomer {
  @scala.inline
  def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  @scala.inline
  implicit class SchemaOrderCustomerOps[Self <: SchemaOrderCustomer] (val x: Self) extends AnyVal {
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
    def withMarketingRightsInfo(value: SchemaOrderCustomerMarketingRightsInfo): Self = {
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

