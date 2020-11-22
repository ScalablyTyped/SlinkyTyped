package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseItem
import typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/reels-media.feed", JSImport.Namespace)
@js.native
object reelsMediaFeedMod extends js.Object {
  
  @js.native
  class ReelsMediaFeed () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
    
    var source: IgAppModule = js.native
    
    /* protected */ def state_=(body: js.Any): Unit = js.native
    
    var userIds: js.Array[Double | String] = js.native
  }
}
