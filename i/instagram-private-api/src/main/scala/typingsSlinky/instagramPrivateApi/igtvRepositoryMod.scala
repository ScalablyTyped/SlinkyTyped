package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.igtvSearchResponseMod.IgtvSearchResponseRootObject
import typingsSlinky.instagramPrivateApi.igtvWriteSeenStateOptionsMod.IgtvWriteSeenStateOptions
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/igtv.repository", "IgtvRepository")
  @js.native
  class IgtvRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def allUserSeries(user: String): js.Promise[_] = js.native
    def allUserSeries(user: String, data: js.Object): js.Promise[_] = js.native
    def allUserSeries(user: Double): js.Promise[_] = js.native
    def allUserSeries(user: Double, data: js.Object): js.Promise[_] = js.native
    
    def createSeries(title: String): js.Promise[_] = js.native
    def createSeries(title: String, description: String): js.Promise[_] = js.native
    
    def search(): js.Promise[IgtvSearchResponseRootObject] = js.native
    def search(query: String): js.Promise[IgtvSearchResponseRootObject] = js.native
    
    def seriesAddEpisode(series: String, mediaId: String): js.Promise[_] = js.native
    def seriesAddEpisode(series: Double, mediaId: String): js.Promise[_] = js.native
    
    def writeSeenState(options: IgtvWriteSeenStateOptions): js.Promise[StatusResponse] = js.native
  }
}
