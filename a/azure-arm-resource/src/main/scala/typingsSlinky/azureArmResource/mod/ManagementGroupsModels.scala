package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ManagementGroupsModels {
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.managementModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.managementModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
