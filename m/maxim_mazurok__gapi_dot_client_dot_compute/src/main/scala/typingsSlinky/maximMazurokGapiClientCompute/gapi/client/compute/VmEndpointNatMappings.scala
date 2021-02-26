package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmEndpointNatMappings extends StObject {
  
  /** Name of the VM instance which the endpoint belongs to */
  var instanceName: js.UndefOr[String] = js.native
  
  var interfaceNatMappings: js.UndefOr[js.Array[VmEndpointNatMappingsInterfaceNatMappings]] = js.native
}
object VmEndpointNatMappings {
  
  @scala.inline
  def apply(): VmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmEndpointNatMappings]
  }
  
  @scala.inline
  implicit class VmEndpointNatMappingsMutableBuilder[Self <: VmEndpointNatMappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setInterfaceNatMappings(value: js.Array[VmEndpointNatMappingsInterfaceNatMappings]): Self = StObject.set(x, "interfaceNatMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNatMappingsUndefined: Self = StObject.set(x, "interfaceNatMappings", js.undefined)
    
    @scala.inline
    def setInterfaceNatMappingsVarargs(value: VmEndpointNatMappingsInterfaceNatMappings*): Self = StObject.set(x, "interfaceNatMappings", js.Array(value :_*))
  }
}
