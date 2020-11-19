package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdultContent(value: Boolean): Self = this.set("adultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdultContent: Self = this.set("adultContent", js.undefined)
    
    @scala.inline
    def setAdwordsLinksVarargs(value: AccountAdwordsLink*): Self = this.set("adwordsLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdwordsLinks(value: js.Array[AccountAdwordsLink]): Self = this.set("adwordsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdwordsLinks: Self = this.set("adwordsLinks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReviewsUrl(value: String): Self = this.set("reviewsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviewsUrl: Self = this.set("reviewsUrl", js.undefined)
    
    @scala.inline
    def setSellerId(value: String): Self = this.set("sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerId: Self = this.set("sellerId", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: AccountUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[AccountUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: AccountYouTubeChannelLink*): Self = this.set("youtubeChannelLinks", js.Array(value :_*))
    
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = this.set("youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoutubeChannelLinks: Self = this.set("youtubeChannelLinks", js.undefined)
  }
}
