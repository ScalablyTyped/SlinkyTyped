package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenceMod {
  
  @JSImport("gitlab/dist/types/core/services/Licence", "Licence")
  @js.native
  class Licence () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: Sudo): js.Promise[js.Object] = js.native
  }
}
