package typingsSlinky.azureArmResource.mod

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureModels {
  
  @JSImport("azure-arm-resource", "FeatureModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.azureArmResource.modelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "FeatureModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.azureArmResource.modelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
