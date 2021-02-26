package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creativesRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/creatives.repository", "CreativesRepository")
  @js.native
  class CreativesRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def writeSupportedCapabilities(): js.Promise[_] = js.native
  }
}
