package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupProperties extends StObject {
  
  /**
    * The provisioning state.
    */
  val provisioningState: js.UndefOr[String] = js.native
}
object ResourceGroupProperties {
  
  @scala.inline
  def apply(): ResourceGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupProperties]
  }
  
  @scala.inline
  implicit class ResourceGroupPropertiesMutableBuilder[Self <: ResourceGroupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
  }
}
