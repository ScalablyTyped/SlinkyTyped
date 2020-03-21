package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.blockedUsersFeedResponseMod.BlockedUsersFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.BlockedUsersFeedResponseBlockedListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/blocked-users.feed", JSImport.Namespace)
@js.native
object blockedUsersFeedMod extends js.Object {
  @js.native
  class BlockedUsersFeed () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
  
}

