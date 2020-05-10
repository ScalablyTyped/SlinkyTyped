package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account data. After the creation of a new account it may take a few minutes
  * before it is fully operational. The methods delete, insert, patch, and
  * update require the admin role.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * List of linked Ads accounts that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected either in
    * the Ads interface or through the AdWords API. To delete an active link,
    * or to cancel a link request, remove it from the list.
    */
  var adsLinks: js.UndefOr[js.Array[SchemaAccountAdsLink]] = js.native
  /**
    * Indicates whether the merchant sells adult content.
    */
  var adultContent: js.UndefOr[Boolean] = js.native
  /**
    * The business information of the account.
    */
  var businessInformation: js.UndefOr[SchemaAccountBusinessInformation] = js.native
  /**
    * The GMB account which is linked or in the process of being linked with
    * the Merchant Center account.
    */
  var googleMyBusinessLink: js.UndefOr[SchemaAccountGoogleMyBusinessLink] = js.native
  /**
    * Merchant Center account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#account&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Display name for the account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Client-specific, locally-unique, internal ID for the child account.
    */
  var sellerId: js.UndefOr[String] = js.native
  /**
    * Users with access to the account. Every account (except for subaccounts)
    * must have at least one admin user.
    */
  var users: js.UndefOr[js.Array[SchemaAccountUser]] = js.native
  /**
    * The merchant&#39;s website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
  /**
    * List of linked YouTube channels that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected in the YT
    * Creator Studio interface. To delete an active link, or to cancel a link
    * request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[SchemaAccountYouTubeChannelLink]] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdsLinks(value: js.Array[SchemaAccountAdsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withAdultContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adultContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdultContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adultContent")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessInformation(value: SchemaAccountBusinessInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleMyBusinessLink(value: SchemaAccountGoogleMyBusinessLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMyBusinessLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleMyBusinessLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMyBusinessLink")(js.undefined)
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
    def withSellerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[SchemaAccountUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withYoutubeChannelLinks(value: js.Array[SchemaAccountYouTubeChannelLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeChannelLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutubeChannelLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeChannelLinks")(js.undefined)
        ret
    }
  }
  
}

