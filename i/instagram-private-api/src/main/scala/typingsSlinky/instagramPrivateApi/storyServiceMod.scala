package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsSlinky.instagramPrivateApi.storiesTypesMod.StoryServiceInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyServiceMod {
  
  @JSImport("instagram-private-api/dist/services/story.service", "StoryService")
  @js.native
  class StoryService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def seen(input: StoryServiceInput): js.Promise[StatusResponse] = js.native
    def seen(input: StoryServiceInput, sourceId: String): js.Promise[StatusResponse] = js.native
  }
}
