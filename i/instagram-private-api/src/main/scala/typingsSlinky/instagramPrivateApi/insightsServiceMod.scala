package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Data
import typingsSlinky.instagramPrivateApi.insightsOptionsMod.AccountInsightsOptions
import typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod.InsightsServiceAccountResponseRootObject
import typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod.InsightsServicePostResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/services/insights.service", JSImport.Namespace)
@js.native
object insightsServiceMod extends js.Object {
  
  @js.native
  class InsightsService () extends Repository {
    
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    
    def igtv(mediaId: String): js.Promise[Data] = js.native
    
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
}
