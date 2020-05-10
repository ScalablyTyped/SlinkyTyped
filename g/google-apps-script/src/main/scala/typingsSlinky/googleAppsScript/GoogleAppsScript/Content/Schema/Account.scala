package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var adultContent: js.UndefOr[Boolean] = js.native
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.native
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.native
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var reviewsUrl: js.UndefOr[String] = js.native
  var sellerId: js.UndefOr[String] = js.native
  var users: js.UndefOr[js.Array[AccountUser]] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
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
    def withBusinessInformation(value: AccountBusinessInformation): Self = {
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
    def withGoogleMyBusinessLink(value: AccountGoogleMyBusinessLink): Self = {
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

