package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderCustomerMarketingRightsInfo extends js.Object {
  /**
    * Last known user selection regarding marketing preferences. In certain
    * cases this selection might not be known, so this field would be empty.
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  /**
    * Timestamp when last time marketing preference was updated. Could be
    * empty, if user wasn&#39;t offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  /**
    * Email address that can be used for marketing purposes. The field may be
    * empty even if explicitMarketingPreference is &#39;granted&#39;. This
    * happens when retrieving an old order from the customer who deleted their
    * account.
    */
  var marketingEmailAddress: js.UndefOr[String] = js.native
}

object SchemaOrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(): SchemaOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomerMarketingRightsInfo]
  }
  @scala.inline
  implicit class SchemaOrderCustomerMarketingRightsInfoOps[Self <: SchemaOrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
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

