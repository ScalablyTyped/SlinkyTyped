package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /** Indicates whether the merchant sells adult content. */
  var adultContent: js.UndefOr[Boolean] = js.native
  /**
    * List of linked AdWords accounts that are active or pending approval. To create a new link request, add a new link with status active to the list. It
    * will remain in a pending state until approved or rejected either in the AdWords interface or through the  AdWords API. To delete an active link, or to
    * cancel a link request, remove it from the list.
    */
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.native
  /** Merchant Center account ID. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#account". */
  var kind: js.UndefOr[String] = js.native
  /** Display name for the account. */
  var name: js.UndefOr[String] = js.native
  /** URL for individual seller reviews, i.e., reviews for each child account. */
  var reviewsUrl: js.UndefOr[String] = js.native
  /** Client-specific, locally-unique, internal ID for the child account. */
  var sellerId: js.UndefOr[String] = js.native
  /** Users with access to the account. Every account (except for subaccounts) must have at least one admin user. */
  var users: js.UndefOr[js.Array[AccountUser]] = js.native
  /** The merchant's website. */
  var websiteUrl: js.UndefOr[String] = js.native
  /**
    * List of linked YouTube channels that are active or pending approval. To create a new link request, add a new link with status active to the list. It
    * will remain in a pending state until approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel a link request,
    * remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAdwordsLinks(value: js.Array[AccountAdwordsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsLinks")(js.undefined)
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
    def withReviewsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewsUrl")(js.undefined)
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
    def withUsers(value: js.Array[AccountUser]): Self = {
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
    def withYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = {
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

