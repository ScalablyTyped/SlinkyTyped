package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Data
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.GraphQLRequestOptions
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adsRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/ads.repository", "AdsRepository")
  @js.native
  class AdsRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def graphQL[T /* <: Data */](options: GraphQLRequestOptions): js.Promise[T] = js.native
  }
}
