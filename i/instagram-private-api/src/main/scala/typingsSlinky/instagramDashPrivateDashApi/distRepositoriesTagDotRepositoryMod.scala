package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTagDotRepositoryDotSearchDotResponseMod.TagRepositorySearchResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/tag.repository", JSImport.Namespace)
@js.native
object distRepositoriesTagDotRepositoryMod extends js.Object {
  @js.native
  class TagRepository () extends Repository {
    def search(q: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
    def section(q: String, tab: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
  }
  
}

