package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseRootObject
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseRootObject
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.blended
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.hashtags
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.users
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fbsearchRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/fbsearch.repository", "FbsearchRepository")
  @js.native
  class FbsearchRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def places(query: String): js.Promise[FbsearchRepositoryPlacesResponseRootObject] = js.native
    
    def recentSearches(): js.Promise[_] = js.native
    
    @JSName("suggestedSearches")
    def suggestedSearches_blended(`type`: blended): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_hashtags(`type`: hashtags): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_places(`type`: places): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_users(`type`: users): js.Promise[_] = js.native
    
    def topsearchFlat(query: String): js.Promise[FbsearchRepositoryTopsearchFlatResponseRootObject] = js.native
  }
}
