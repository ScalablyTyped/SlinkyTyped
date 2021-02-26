package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedAccountRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/linked-account.repository", "LinkedAccountRepository")
  @js.native
  class LinkedAccountRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def getLinkageStatus(): js.Promise[_] = js.native
  }
}
