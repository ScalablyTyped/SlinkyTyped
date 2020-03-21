package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "LinkModels")
@js.native
object LinkModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typingsSlinky.msRestAzure.mod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.linkModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

