package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotPlacesDotResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typingsSlinky.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotSearchDotResponseMod.LocationRepositorySearchResponseVenuesItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTagDotRepositoryDotSearchDotResponseMod.TagRepositorySearchResponseResultsItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesUserDotRepositoryDotSearchDotResponseMod.UserRepositorySearchResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/search.service", JSImport.Namespace)
@js.native
object distServicesSearchDotServiceMod extends js.Object {
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

