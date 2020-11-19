package typingsSlinky.gitlab.userImpersonationTokensMod

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/UserImpersonationTokens", "UserImpersonationTokens")
@js.native
class UserImpersonationTokens () extends BaseService {
  
  def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
  def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
  
  def all(userId: Double): js.Promise[GetResponse] = js.native
  def all(userId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  
  def revoke(userId: Double, tokenId: Double): js.Promise[js.Object] = js.native
  def revoke(userId: Double, tokenId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def show(userId: Double, tokenId: Double): js.Promise[GetResponse] = js.native
  def show(userId: Double, tokenId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}
