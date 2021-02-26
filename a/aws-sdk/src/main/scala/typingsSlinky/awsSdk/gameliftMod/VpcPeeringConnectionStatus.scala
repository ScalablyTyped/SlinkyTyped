package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnectionStatus extends StObject {
  
  /**
    * Code indicating the status of a VPC peering connection.
    */
  var Code: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Additional messaging associated with the connection status. 
    */
  var Message: js.UndefOr[NonZeroAndMaxString] = js.native
}
object VpcPeeringConnectionStatus {
  
  @scala.inline
  def apply(): VpcPeeringConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionStatus]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionStatusMutableBuilder[Self <: VpcPeeringConnectionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NonZeroAndMaxString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: NonZeroAndMaxString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
