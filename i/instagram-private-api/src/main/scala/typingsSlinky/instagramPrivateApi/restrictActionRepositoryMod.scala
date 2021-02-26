package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.restrictActionRepositoryRestrictResponseMod.RestrictActionRepositoryRestrictResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restrictActionRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/restrict-action.repository", "RestrictActionRepository")
  @js.native
  class RestrictActionRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def restrict(targetUserId: String): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    def restrict(targetUserId: Double): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    
    def unrestrict(targetUserId: String): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    def unrestrict(targetUserId: Double): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
  }
}
