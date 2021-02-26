package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributionRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/attribution.repository", "AttributionRepository")
  @js.native
  class AttributionRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def logAttribution(): js.Promise[_] = js.native
    
    def logResurrectAttribution(): js.Promise[_] = js.native
  }
}
