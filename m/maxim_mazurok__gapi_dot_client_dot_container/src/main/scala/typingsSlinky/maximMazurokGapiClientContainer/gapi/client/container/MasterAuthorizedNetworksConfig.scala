package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterAuthorizedNetworksConfig extends StObject {
  
  /** cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS. */
  var cidrBlocks: js.UndefOr[js.Array[CidrBlock]] = js.native
  
  /** Whether or not master authorized networks is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object MasterAuthorizedNetworksConfig {
  
  @scala.inline
  def apply(): MasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuthorizedNetworksConfig]
  }
  
  @scala.inline
  implicit class MasterAuthorizedNetworksConfigMutableBuilder[Self <: MasterAuthorizedNetworksConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlocks(value: js.Array[CidrBlock]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
    
    @scala.inline
    def setCidrBlocksVarargs(value: CidrBlock*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
