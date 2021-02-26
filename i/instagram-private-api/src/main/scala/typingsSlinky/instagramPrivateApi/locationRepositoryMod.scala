package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.locationRepositoryInfoResponseMod.LocationRepositoryInfoResponseRootObject
import typingsSlinky.instagramPrivateApi.locationRepositoryStoryResponseMod.LocationRepositoryStoryResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/location.repository", "LocationRepository")
  @js.native
  class LocationRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def info(id: String): js.Promise[LocationRepositoryInfoResponseRootObject] = js.native
    def info(id: Double): js.Promise[LocationRepositoryInfoResponseRootObject] = js.native
    
    def story(id: String): js.Promise[LocationRepositoryStoryResponseRootObject] = js.native
    def story(id: Double): js.Promise[LocationRepositoryStoryResponseRootObject] = js.native
  }
}
