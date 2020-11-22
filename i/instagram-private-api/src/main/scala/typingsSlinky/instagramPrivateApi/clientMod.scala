package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountRepositoryMod.AccountRepository
import typingsSlinky.instagramPrivateApi.addressBookRepositoryMod.AddressBookRepository
import typingsSlinky.instagramPrivateApi.adsRepositoryMod.AdsRepository
import typingsSlinky.instagramPrivateApi.attributionRepositoryMod.AttributionRepository
import typingsSlinky.instagramPrivateApi.challengeRepositoryMod.ChallengeRepository
import typingsSlinky.instagramPrivateApi.consentRepositoryMod.ConsentRepository
import typingsSlinky.instagramPrivateApi.creativesRepositoryMod.CreativesRepository
import typingsSlinky.instagramPrivateApi.directRepositoryMod.DirectRepository
import typingsSlinky.instagramPrivateApi.directThreadRepositoryMod.DirectThreadRepository
import typingsSlinky.instagramPrivateApi.discoverRepositoryMod.DiscoverRepository
import typingsSlinky.instagramPrivateApi.entityFactoryMod.EntityFactory
import typingsSlinky.instagramPrivateApi.fbsearchRepositoryMod.FbsearchRepository
import typingsSlinky.instagramPrivateApi.feedFactoryMod.FeedFactory
import typingsSlinky.instagramPrivateApi.friendshipRepositoryMod.FriendshipRepository
import typingsSlinky.instagramPrivateApi.highlightsRepositoryMod.HighlightsRepository
import typingsSlinky.instagramPrivateApi.igtvRepositoryMod.IgtvRepository
import typingsSlinky.instagramPrivateApi.insightsServiceMod.InsightsService
import typingsSlinky.instagramPrivateApi.launcherRepositoryMod.LauncherRepository
import typingsSlinky.instagramPrivateApi.linkedAccountRepositoryMod.LinkedAccountRepository
import typingsSlinky.instagramPrivateApi.liveRepositoryMod.LiveRepository
import typingsSlinky.instagramPrivateApi.locationRepositoryMod.LocationRepository
import typingsSlinky.instagramPrivateApi.locationSearchRepositoryMod.LocationSearch
import typingsSlinky.instagramPrivateApi.loomRepositoryMod.LoomRepository
import typingsSlinky.instagramPrivateApi.mediaRepositoryMod.MediaRepository
import typingsSlinky.instagramPrivateApi.musicRepositoryMod.MusicRepository
import typingsSlinky.instagramPrivateApi.newsRepositoryMod.NewsRepository
import typingsSlinky.instagramPrivateApi.publishServiceMod.PublishService
import typingsSlinky.instagramPrivateApi.qeRepositoryMod.QeRepository
import typingsSlinky.instagramPrivateApi.qpRepositoryMod.QpRepository
import typingsSlinky.instagramPrivateApi.requestMod.Request
import typingsSlinky.instagramPrivateApi.restrictActionRepositoryMod.RestrictActionRepository
import typingsSlinky.instagramPrivateApi.searchServiceMod.SearchService
import typingsSlinky.instagramPrivateApi.simulateServiceMod.SimulateService
import typingsSlinky.instagramPrivateApi.stateMod.State
import typingsSlinky.instagramPrivateApi.statusRepositoryMod.StatusRepository
import typingsSlinky.instagramPrivateApi.storyServiceMod.StoryService
import typingsSlinky.instagramPrivateApi.tagRepositoryMod.TagRepository
import typingsSlinky.instagramPrivateApi.uploadRepositoryMod.UploadRepository
import typingsSlinky.instagramPrivateApi.userRepositoryMod.UserRepository
import typingsSlinky.instagramPrivateApi.zrRepositoryMod.ZrRepository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/core/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  @js.native
  class IgApiClient () extends js.Object {
    
    var account: AccountRepository = js.native
    
    var addressBook: AddressBookRepository = js.native
    
    var ads: AdsRepository = js.native
    
    var attribution: AttributionRepository = js.native
    
    var challenge: ChallengeRepository = js.native
    
    var consent: ConsentRepository = js.native
    
    var creatives: CreativesRepository = js.native
    
    def destroy(): Unit = js.native
    
    var direct: DirectRepository = js.native
    
    var directThread: DirectThreadRepository = js.native
    
    var discover: DiscoverRepository = js.native
    
    var entity: EntityFactory = js.native
    
    var fbsearch: FbsearchRepository = js.native
    
    var feed: FeedFactory = js.native
    
    var friendship: FriendshipRepository = js.native
    
    var highlights: HighlightsRepository = js.native
    
    var igtv: IgtvRepository = js.native
    
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
    
    var status: StatusRepository = js.native
    
    var story: StoryService = js.native
    
    var tag: TagRepository = js.native
    
    var upload: UploadRepository = js.native
    
    var user: UserRepository = js.native
    
    var zr: ZrRepository = js.native
  }
}
