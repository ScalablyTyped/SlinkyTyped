package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "ResourceModels")
@js.native
object ResourceModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typingsSlinky.msRestAzure.mod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.resourceModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

