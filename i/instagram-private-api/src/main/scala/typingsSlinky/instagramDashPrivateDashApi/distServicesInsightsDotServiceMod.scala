package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod.InsightsServiceAccountResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod.InsightsServicePostResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesStoriesDashInsightsDotFeedDotResponseMod.StoriesInsightsFeedResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod.AccountInsightsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/insights.service", JSImport.Namespace)
@js.native
object distServicesInsightsDotServiceMod extends js.Object {
  @js.native
  class InsightsService () extends Repository {
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    def igtv(mediaId: String): js.Promise[Anon_Data] = js.native
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
  
}

