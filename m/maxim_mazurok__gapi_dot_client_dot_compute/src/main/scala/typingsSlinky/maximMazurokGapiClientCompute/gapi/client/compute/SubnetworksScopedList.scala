package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworksScopedList extends StObject {
  
  /** A list of subnetworks contained in this scope. */
  var subnetworks: js.UndefOr[js.Array[Subnetwork]] = js.native
  
  /** An informational warning that appears when the list of addresses is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object SubnetworksScopedList {
  
  @scala.inline
  def apply(): SubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksScopedList]
  }
  
  @scala.inline
  implicit class SubnetworksScopedListMutableBuilder[Self <: SubnetworksScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetworks(value: js.Array[Subnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: Subnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
