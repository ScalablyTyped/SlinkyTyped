package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.GroupId
import typingsSlinky.gitlab.anon.ProjectId
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuesStatisticsMod {
  
  @JSImport("gitlab/dist/types/core/services/IssuesStatistics", "IssuesStatistics")
  @js.native
  class IssuesStatistics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (ProjectId | GroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
