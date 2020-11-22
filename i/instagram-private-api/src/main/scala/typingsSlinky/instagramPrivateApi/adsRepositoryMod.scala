package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Data
import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.GraphQLRequestOptions
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/ads.repository", JSImport.Namespace)
@js.native
object adsRepositoryMod extends js.Object {
  
  @js.native
  class AdsRepository () extends Repository {
    
    def graphQL[T /* <: Data */](options: GraphQLRequestOptions): js.Promise[T] = js.native
  }
}
