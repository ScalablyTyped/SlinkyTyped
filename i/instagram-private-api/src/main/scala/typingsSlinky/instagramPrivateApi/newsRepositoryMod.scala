package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod.NewsRepositoryInboxResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/news.repository", JSImport.Namespace)
@js.native
object newsRepositoryMod extends js.Object {
  
  @js.native
  class NewsRepository () extends Repository {
    
    def inbox(): js.Promise[NewsRepositoryInboxResponseRootObject] = js.native
  }
}
