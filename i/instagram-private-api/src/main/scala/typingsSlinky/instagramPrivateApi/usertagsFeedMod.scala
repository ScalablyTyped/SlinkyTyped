package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod.UsertagsFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod.UsertagsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usertagsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/usertags.feed", "UsertagsFeed")
  @js.native
  class UsertagsFeed protected () extends Feed[UsertagsFeedResponseRootObject, UsertagsFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var id: Double | String = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[UsertagsFeedResponseRootObject] = js.native
  }
}
