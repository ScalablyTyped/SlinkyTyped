package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userImpersonationTokensMod {
  
  @JSImport("gitlab/dist/types/core/services/UserImpersonationTokens", "UserImpersonationTokens")
  @js.native
  class UserImpersonationTokens () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(userId: Double): js.Promise[GetResponse] = js.native
    def all(userId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def revoke(userId: Double, tokenId: Double): js.Promise[js.Object] = js.native
    def revoke(userId: Double, tokenId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(userId: Double, tokenId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, tokenId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gitlab.gitlabStrings.api
    - typingsSlinky.gitlab.gitlabStrings.read_user
  */
  trait ImpersonationTokenScope extends StObject
  object ImpersonationTokenScope {
    
    @scala.inline
    def api: typingsSlinky.gitlab.gitlabStrings.api = "api".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.api]
    
    @scala.inline
    def read_user: typingsSlinky.gitlab.gitlabStrings.read_user = "read_user".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.read_user]
  }
}
