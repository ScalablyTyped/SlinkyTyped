package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkOutput extends StObject {
  
  /**
    * The unique identifier for the first member within the network.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The unique identifier for the network.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
}
object CreateNetworkOutput {
  
  @scala.inline
  def apply(): CreateNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkOutput]
  }
  
  @scala.inline
  implicit class CreateNetworkOutputMutableBuilder[Self <: CreateNetworkOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
  }
}
