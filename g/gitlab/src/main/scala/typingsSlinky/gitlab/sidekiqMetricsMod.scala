package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidekiqMetricsMod {
  
  @JSImport("gitlab/dist/types/core/services/SidekiqMetrics", "SidekiqMetrics")
  @js.native
  class SidekiqMetrics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    
    def jobStats(): js.Promise[GetResponse] = js.native
    
    def processMetrics(): js.Promise[GetResponse] = js.native
    
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
}
