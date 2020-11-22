package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.createHighlightsReelOptionsMod.CreateHighlightsReelOptions
import typingsSlinky.instagramPrivateApi.editHighlightsReelOptionsMod.EditHighlightsReelOptions
import typingsSlinky.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod.HighlightsRepositoryCreateReelResponseRootObject
import typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod.HighlightsRepositoryEditReelResponseRootObject
import typingsSlinky.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod.HighlightsRepositoryHighlightsTrayResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/highlights.repository", JSImport.Namespace)
@js.native
object highlightsRepositoryMod extends js.Object {
  
  @js.native
  class HighlightsRepository () extends Repository {
    
    def createReel(options: CreateHighlightsReelOptions): js.Promise[HighlightsRepositoryCreateReelResponseRootObject] = js.native
    
    def deleteReel(highlightId: String): js.Promise[StatusResponse] = js.native
    
    def editReel(options: EditHighlightsReelOptions): js.Promise[HighlightsRepositoryEditReelResponseRootObject] = js.native
    
    def highlightsTray(userId: String): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
    def highlightsTray(userId: Double): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
  }
}
