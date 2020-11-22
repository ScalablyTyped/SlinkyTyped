package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.restrictActionRepositoryRestrictResponseMod.RestrictActionRepositoryRestrictResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/restrict-action.repository", JSImport.Namespace)
@js.native
object restrictActionRepositoryMod extends js.Object {
  
  @js.native
  class RestrictActionRepository () extends Repository {
    
    def restrict(targetUserId: String): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    def restrict(targetUserId: Double): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    
    def unrestrict(targetUserId: String): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
    def unrestrict(targetUserId: Double): js.Promise[RestrictActionRepositoryRestrictResponseRootObject] = js.native
  }
}
