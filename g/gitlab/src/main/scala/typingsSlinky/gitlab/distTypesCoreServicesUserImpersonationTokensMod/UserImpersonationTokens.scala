package typingsSlinky.gitlab.distTypesCoreServicesUserImpersonationTokensMod

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

