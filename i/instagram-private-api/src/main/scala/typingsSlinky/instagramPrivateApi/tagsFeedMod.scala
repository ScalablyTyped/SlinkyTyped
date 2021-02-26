package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.top
import typingsSlinky.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponse
import typingsSlinky.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponseMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/tags.feed", "TagsFeed")
  @js.native
  class TagsFeed protected () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    var nextMediaIds: js.Any = js.native
    
    var nextPage: js.Any = js.native
    
    def request(): js.Promise[TagsFeedResponse] = js.native
    
    var tab: top | recent | places = js.native
    
    var tag: String = js.native
  }
}
