package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotCreateDashReelDotResponseMod.HighlightsRepositoryCreateReelResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod.HighlightsRepositoryEditReelResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod.HighlightsRepositoryHighlightsTrayResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typingsSlinky.instagramDashPrivateDashApi.distTypesCreateDashHighlightsDashReelDotOptionsMod.CreateHighlightsReelOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesEditDashHighlightsDashReelDotOptionsMod.EditHighlightsReelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/highlights.repository", JSImport.Namespace)
@js.native
object distRepositoriesHighlightsDotRepositoryMod extends js.Object {
  @js.native
  class HighlightsRepository () extends Repository {
    def createReel(options: CreateHighlightsReelOptions): js.Promise[HighlightsRepositoryCreateReelResponseRootObject] = js.native
    def deleteReel(highlightId: String): js.Promise[StatusResponse] = js.native
    def editReel(options: EditHighlightsReelOptions): js.Promise[HighlightsRepositoryEditReelResponseRootObject] = js.native
    def highlightsTray(userId: String): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
    def highlightsTray(userId: Double): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
  }
  
}

