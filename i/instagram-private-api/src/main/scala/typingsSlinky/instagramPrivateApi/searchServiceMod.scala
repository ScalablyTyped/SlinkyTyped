package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typingsSlinky.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseVenuesItem
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseResultsItem
import typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/search.service", JSImport.Namespace)
@js.native
object searchServiceMod extends js.Object {
  @js.native
  class SearchService () extends Repository {
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

