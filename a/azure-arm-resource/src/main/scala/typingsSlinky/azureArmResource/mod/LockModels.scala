package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LockModels {
  
  @JSImport("azure-arm-resource", "LockModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.lockModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LockModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.lockModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
