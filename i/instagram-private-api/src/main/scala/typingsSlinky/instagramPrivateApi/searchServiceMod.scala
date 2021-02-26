package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typingsSlinky.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseVenuesItem
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseResultsItem
import typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchServiceMod {
  
  @JSImport("instagram-private-api/dist/services/search.service", "SearchService")
  @js.native
  class SearchService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def blended(query: String): js.Promise[js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]] = js.native
    
    def blendedItems(query: String): js.Promise[
        js.Array[
          FbsearchRepositoryTopsearchFlatResponsePlace | FbsearchRepositoryTopsearchFlatResponseHashtag | FbsearchRepositoryTopsearchFlatResponseUser
        ]
      ] = js.native
    
    def location(latitude: Double, longitude: Double): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    def location(latitude: Double, longitude: Double, query: String): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    
    def places(query: String): js.Promise[js.Array[FbsearchRepositoryPlacesResponseItemsItem]] = js.native
    
    def tags(query: String): js.Promise[js.Array[TagRepositorySearchResponseResultsItem]] = js.native
    
    def users(query: String): js.Promise[js.Array[UserRepositorySearchResponseUsersItem]] = js.native
  }
}
