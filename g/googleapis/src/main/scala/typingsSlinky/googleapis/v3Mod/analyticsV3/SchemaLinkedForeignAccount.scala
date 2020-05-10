package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics Remarketing Audience Foreign Link.
  */
@js.native
trait SchemaLinkedForeignAccount extends js.Object {
  /**
    * Account ID to which this linked foreign account belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether this is eligible for search.
    */
  var eligibleForSearch: js.UndefOr[Boolean] = js.native
  /**
    * Entity ad account link ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this linked foreign account
    * belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for linked foreign account.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The foreign account ID. For example the an Google Ads `linkedAccountId`
    * has the following format XXX-XXX-XXXX.
    */
  var linkedAccountId: js.UndefOr[String] = js.native
  /**
    * Remarketing audience ID to which this linked foreign account belongs.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.native
  /**
    * The status of this foreign account link.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The type of the foreign account. For example, `ADWORDS_LINKS`,
    * `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY to which this linked foreign
    * account belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaLinkedForeignAccount {
  @scala.inline
  def apply(): SchemaLinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedForeignAccount]
  }
  @scala.inline
  implicit class SchemaLinkedForeignAccountOps[Self <: SchemaLinkedForeignAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEligibleForSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibleForSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligibleForSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibleForSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withInternalWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarketingAudienceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingAudienceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingAudienceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingAudienceId")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

