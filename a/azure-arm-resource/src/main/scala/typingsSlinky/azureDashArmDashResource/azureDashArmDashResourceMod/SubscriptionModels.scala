package typingsSlinky.azureDashArmDashResource.azureDashArmDashResourceMod

import typingsSlinky.msDashRestDashAzure.msDashRestDashAzureMod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "SubscriptionModels")
@js.native
object SubscriptionModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typingsSlinky.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureDashArmDashResource.libSubscriptionModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

