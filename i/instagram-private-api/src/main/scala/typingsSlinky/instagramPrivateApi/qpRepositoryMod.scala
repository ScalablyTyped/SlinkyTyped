package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qpRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/qp.repository", "QpRepository")
  @js.native
  class QpRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def batchFetch(): js.Promise[IgResponse[_]] = js.native
    
    def getCooldowns(): js.Promise[IgResponse[_]] = js.native
    
    var surfacesToQueries: String = js.native
    
    var surfacesToTriggers: String = js.native
  }
}
