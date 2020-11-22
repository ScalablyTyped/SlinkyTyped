package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFollowingFeedResponseMod.AccountFollowingFeedResponse
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.date_followed_earliest
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.date_followed_latest
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.default
import typingsSlinky.instagramPrivateApi.responsesMod.AccountFollowingFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/account-following.feed", JSImport.Namespace)
@js.native
object accountFollowingFeedMod extends js.Object {
  
  @js.native
  class AccountFollowingFeed () extends Feed[AccountFollowingFeedResponse, AccountFollowingFeedResponseUsersItem] {
    
    var enableGroups: Boolean = js.native
    
    var id: Double | String = js.native
    
    var includesHashtags: Boolean = js.native
    
    var nextMaxId: js.Any = js.native
    
    var order: js.UndefOr[default | date_followed_latest | date_followed_earliest] = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[AccountFollowingFeedResponse] = js.native
    
    var searchSurface: js.UndefOr[String] = js.native
  }
}
