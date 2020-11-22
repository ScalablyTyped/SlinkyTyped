package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFollowersFeedResponseMod.AccountFollowersFeedResponse
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.default
import typingsSlinky.instagramPrivateApi.responsesMod.AccountFollowersFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/account-followers.feed", JSImport.Namespace)
@js.native
object accountFollowersFeedMod extends js.Object {
  
  @js.native
  class AccountFollowersFeed () extends Feed[AccountFollowersFeedResponse, AccountFollowersFeedResponseUsersItem] {
    
    var enableGroups: Boolean = js.native
    
    var id: Double | String = js.native
    
    var nextMaxId: js.Any = js.native
    
    var order: js.UndefOr[default] = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[AccountFollowersFeedResponse] = js.native
    
    var searchSurface: js.UndefOr[String] = js.native
  }
}
