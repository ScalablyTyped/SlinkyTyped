package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationSearchRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/location-search.repository", "LocationSearch")
  @js.native
  class LocationSearch protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def index(latitude: Double, longitude: Double): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
    def index(latitude: Double, longitude: Double, searchQuery: String): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
  }
}
