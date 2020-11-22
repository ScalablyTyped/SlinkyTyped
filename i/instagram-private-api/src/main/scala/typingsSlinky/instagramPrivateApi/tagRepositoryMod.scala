package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/tag.repository", JSImport.Namespace)
@js.native
object tagRepositoryMod extends js.Object {
  
  @js.native
  class TagRepository () extends Repository {
    
    def search(q: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
    
    def section(q: String, tab: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
  }
}
