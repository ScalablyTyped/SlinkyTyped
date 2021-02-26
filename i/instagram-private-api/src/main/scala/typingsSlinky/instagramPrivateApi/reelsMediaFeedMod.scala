package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseItem
import typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reelsMediaFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/reels-media.feed", "ReelsMediaFeed")
  @js.native
  class ReelsMediaFeed protected () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    def this(client: IgApiClient) = this()
    
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
    
    var source: IgAppModule = js.native
    
    /* protected */ def state_=(body: js.Any): Unit = js.native
    
    var userIds: js.Array[Double | String] = js.native
  }
}
