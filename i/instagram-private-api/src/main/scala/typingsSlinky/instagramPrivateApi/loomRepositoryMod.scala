package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loomRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/loom.repository", "LoomRepository")
  @js.native
  class LoomRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def fetchConfig(): js.Promise[_] = js.native
  }
}
