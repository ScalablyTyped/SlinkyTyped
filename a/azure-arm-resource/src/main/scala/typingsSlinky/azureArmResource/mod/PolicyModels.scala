package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolicyModels {
  
  @JSImport("azure-arm-resource", "PolicyModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.policyModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "PolicyModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.policyModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
