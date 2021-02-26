package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResourceModels {
  
  @JSImport("azure-arm-resource", "ResourceModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.resourceModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ResourceModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.resourceModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
