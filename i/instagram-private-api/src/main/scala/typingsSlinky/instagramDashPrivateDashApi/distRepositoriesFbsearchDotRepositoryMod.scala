package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotPlacesDotResponseMod.FbsearchRepositoryPlacesResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.blended
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.hashtags
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/fbsearch.repository", JSImport.Namespace)
@js.native
object distRepositoriesFbsearchDotRepositoryMod extends js.Object {
  @js.native
  class FbsearchRepository () extends Repository {
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

