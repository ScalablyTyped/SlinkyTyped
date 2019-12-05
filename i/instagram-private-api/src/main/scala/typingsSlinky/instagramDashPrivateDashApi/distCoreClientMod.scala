package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreEntityDotFactoryMod.EntityFactory
import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedDotFactoryMod.FeedFactory
import typingsSlinky.instagramDashPrivateDashApi.distCoreRequestMod.Request
import typingsSlinky.instagramDashPrivateDashApi.distCoreStateMod.State
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesAccountDotRepositoryMod.AccountRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesAddressDashBookDotRepositoryMod.AddressBookRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesAdsDotRepositoryMod.AdsRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesAttributionDotRepositoryMod.AttributionRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesChallengeDotRepositoryMod.ChallengeRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesConsentDotRepositoryMod.ConsentRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesCreativesDotRepositoryMod.CreativesRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesDirectDashThreadDotRepositoryMod.DirectThreadRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesDirectDotRepositoryMod.DirectRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesDiscoverDotRepositoryMod.DiscoverRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesFbsearchDotRepositoryMod.FbsearchRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesFriendshipDotRepositoryMod.FriendshipRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesHighlightsDotRepositoryMod.HighlightsRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLauncherDotRepositoryMod.LauncherRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLinkedDashAccountDotRepositoryMod.LinkedAccountRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLiveDotRepositoryMod.LiveRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLocationDashSearchDotRepositoryMod.LocationSearch
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLocationDotRepositoryMod.LocationRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesLoomDotRepositoryMod.LoomRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesMediaDotRepositoryMod.MediaRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesMusicDotRepositoryMod.MusicRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesNewsDotRepositoryMod.NewsRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesQeDotRepositoryMod.QeRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesQpDotRepositoryMod.QpRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesRestrictDashActionDotRepositoryMod.RestrictActionRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesTagDotRepositoryMod.TagRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesUploadDotRepositoryMod.UploadRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesUserDotRepositoryMod.UserRepository
import typingsSlinky.instagramDashPrivateDashApi.distRepositoriesZrDotRepositoryMod.ZrRepository
import typingsSlinky.instagramDashPrivateDashApi.distServicesInsightsDotServiceMod.InsightsService
import typingsSlinky.instagramDashPrivateDashApi.distServicesPublishDotServiceMod.PublishService
import typingsSlinky.instagramDashPrivateDashApi.distServicesSearchDotServiceMod.SearchService
import typingsSlinky.instagramDashPrivateDashApi.distServicesSimulateDotServiceMod.SimulateService
import typingsSlinky.instagramDashPrivateDashApi.distServicesStoryDotServiceMod.StoryService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/client", JSImport.Namespace)
@js.native
object distCoreClientMod extends js.Object {
  @js.native
  class IgApiClient () extends js.Object {
    var account: AccountRepository = js.native
    var addressBook: AddressBookRepository = js.native
    var ads: AdsRepository = js.native
    var attribution: AttributionRepository = js.native
    var challenge: ChallengeRepository = js.native
    var consent: ConsentRepository = js.native
    var creatives: CreativesRepository = js.native
    var direct: DirectRepository = js.native
    var directThread: DirectThreadRepository = js.native
    var discover: DiscoverRepository = js.native
    var entity: EntityFactory = js.native
    var fbsearch: FbsearchRepository = js.native
    var feed: FeedFactory = js.native
    var friendship: FriendshipRepository = js.native
    var highlights: HighlightsRepository = js.native
    var insights: InsightsService = js.native
    var launcher: LauncherRepository = js.native
    var linkedAccount: LinkedAccountRepository = js.native
    var live: LiveRepository = js.native
    var location: LocationRepository = js.native
    var locationSearch: LocationSearch = js.native
    var loom: LoomRepository = js.native
    var media: MediaRepository = js.native
    var music: MusicRepository = js.native
    var news: NewsRepository = js.native
    var publish: PublishService = js.native
    var qe: QeRepository = js.native
    var qp: QpRepository = js.native
    var request: Request = js.native
    var restrictAction: RestrictActionRepository = js.native
    var search: SearchService = js.native
    var simulate: SimulateService = js.native
    var state: State = js.native
    var story: StoryService = js.native
    var tag: TagRepository = js.native
    var upload: UploadRepository = js.native
    var user: UserRepository = js.native
    var zr: ZrRepository = js.native
    def destroy(): Unit = js.native
  }
  
}

