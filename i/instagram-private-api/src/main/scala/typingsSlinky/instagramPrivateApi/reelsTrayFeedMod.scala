package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseTrayItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-tray.feed", JSImport.Namespace)
@js.native
object reelsTrayFeedMod extends js.Object {
  @js.native
  class ReelsTrayFeed () extends Feed[ReelsTrayFeedResponseRootObject, ReelsTrayFeedResponseTrayItem] {
    var reason: cold_start | pull_to_refresh = js.native
    def request(): js.Promise[ReelsTrayFeedResponseRootObject] = js.native
  }
  
}

