package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.Level
import typingsSlinky.gitlab.anon.`0`
import typingsSlinky.gitlab.anon.`1`
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationSettingsMod {
  
  @JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
  @js.native
  class NotificationSettings () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdGroupIdOptions: (`0` | `1`) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(hasProjectIdGroupIdOptions: Level with (`0` | `1`) with BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gitlab.gitlabStrings.disabled
    - typingsSlinky.gitlab.gitlabStrings.participating
    - typingsSlinky.gitlab.gitlabStrings.watch
    - typingsSlinky.gitlab.gitlabStrings.global
    - typingsSlinky.gitlab.gitlabStrings.mention
    - typingsSlinky.gitlab.gitlabStrings.custom
  */
  trait NotificationSettingLevel extends StObject
  object NotificationSettingLevel {
    
    @scala.inline
    def custom: typingsSlinky.gitlab.gitlabStrings.custom = "custom".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.custom]
    
    @scala.inline
    def disabled: typingsSlinky.gitlab.gitlabStrings.disabled = "disabled".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.disabled]
    
    @scala.inline
    def global: typingsSlinky.gitlab.gitlabStrings.global = "global".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.global]
    
    @scala.inline
    def mention: typingsSlinky.gitlab.gitlabStrings.mention = "mention".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.mention]
    
    @scala.inline
    def participating: typingsSlinky.gitlab.gitlabStrings.participating = "participating".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.participating]
    
    @scala.inline
    def watch: typingsSlinky.gitlab.gitlabStrings.watch = "watch".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.watch]
  }
}
