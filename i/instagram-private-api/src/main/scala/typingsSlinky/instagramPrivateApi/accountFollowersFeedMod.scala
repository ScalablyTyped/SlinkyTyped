package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFollowersFeedResponseMod.AccountFollowersFeedResponse
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.default
import typingsSlinky.instagramPrivateApi.responsesMod.AccountFollowersFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFollowersFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/account-followers.feed", "AccountFollowersFeed")
  @js.native
  class AccountFollowersFeed protected () extends Feed[AccountFollowersFeedResponse, AccountFollowersFeedResponseUsersItem] {
    def this(client: IgApiClient) = this()
    
    var enableGroups: Boolean = js.native
    
    var id: Double | String = js.native
    
    var nextMaxId: js.Any = js.native
    
    var order: js.UndefOr[default] = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[AccountFollowersFeedResponse] = js.native
    
    var searchSurface: js.UndefOr[String] = js.native
  }
}
