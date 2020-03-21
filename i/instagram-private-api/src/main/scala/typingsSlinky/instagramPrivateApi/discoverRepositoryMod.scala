package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.discoverRepositoryChainingResponseMod.DiscoverRepositoryChainingResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/discover.repository", JSImport.Namespace)
@js.native
object discoverRepositoryMod extends js.Object {
  @js.native
  class DiscoverRepository () extends Repository {
    def chaining(targetId: String): js.Promise[DiscoverRepositoryChainingResponseRootObject] = js.native
    def markSuSeen(): js.Promise[_] = js.native
    def profileSuBadge(): js.Promise[_] = js.native
    def topicalExplore(): js.Promise[_] = js.native
  }
  
}

