package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object epicIssuesMod {
  
  @JSImport("gitlab/dist/types/core/services/EpicIssues", "EpicIssues")
  @js.native
  class EpicIssues () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(groupId: String, epicId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: String, epicId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double, epicId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, epicId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def assign(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def assign(groupId: String, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def assign(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def assign(groupId: Double, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
