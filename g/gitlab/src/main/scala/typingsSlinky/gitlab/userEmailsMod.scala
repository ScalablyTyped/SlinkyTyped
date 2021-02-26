package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.userIdnumberundefinedBase
import typingsSlinky.gitlab.anon.userIdnumberundefinedPagi
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userEmailsMod {
  
  @JSImport("gitlab/dist/types/core/services/UserEmails", "UserEmails")
  @js.native
  class UserEmails () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(email: js.Any): js.Promise[js.Object] = js.native
    def add(email: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(emailId: js.Any): js.Promise[js.Object] = js.native
    def remove(emailId: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(emailId: js.Any): js.Promise[GetResponse] = js.native
    def show(emailId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
