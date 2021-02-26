package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterServiceProvider extends StObject {
  
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: ResourceName = js.native
}
object VirtualRouterServiceProvider {
  
  @scala.inline
  def apply(virtualRouterName: ResourceName): VirtualRouterServiceProvider = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterServiceProvider]
  }
  
  @scala.inline
  implicit class VirtualRouterServiceProviderMutableBuilder[Self <: VirtualRouterServiceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
