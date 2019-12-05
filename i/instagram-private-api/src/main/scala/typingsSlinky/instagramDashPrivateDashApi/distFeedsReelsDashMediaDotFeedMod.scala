package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod.ReelsMediaFeedResponseItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod.ReelsMediaFeedResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-media.feed", JSImport.Namespace)
@js.native
object distFeedsReelsDashMediaDotFeedMod extends js.Object {
  @js.native
  class ReelsMediaFeed () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    var source: IgAppModule = js.native
    var userIds: js.Array[Double | String] = js.native
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
  }
  
}

