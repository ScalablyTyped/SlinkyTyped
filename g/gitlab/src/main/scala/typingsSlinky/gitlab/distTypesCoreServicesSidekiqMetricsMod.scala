package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/SidekiqMetrics", JSImport.Namespace)
@js.native
object distTypesCoreServicesSidekiqMetricsMod extends js.Object {
  @js.native
  class SidekiqMetrics () extends BaseService {
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    def jobStats(): js.Promise[GetResponse] = js.native
    def processMetrics(): js.Promise[GetResponse] = js.native
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
  
}

