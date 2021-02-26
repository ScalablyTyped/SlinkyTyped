package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod.NewsRepositoryInboxResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newsRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/news.repository", "NewsRepository")
  @js.native
  class NewsRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def inbox(): js.Promise[NewsRepositoryInboxResponseRootObject] = js.native
  }
}
