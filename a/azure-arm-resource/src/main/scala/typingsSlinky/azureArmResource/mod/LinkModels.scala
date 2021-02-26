package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkModels {
  
  @JSImport("azure-arm-resource", "LinkModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.linkModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LinkModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.linkModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
