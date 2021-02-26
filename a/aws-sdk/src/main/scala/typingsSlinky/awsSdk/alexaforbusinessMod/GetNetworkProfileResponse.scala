package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkProfileResponse extends StObject {
  
  /**
    * The network profile associated with a device.
    */
  var NetworkProfile: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NetworkProfile] = js.native
}
object GetNetworkProfileResponse {
  
  @scala.inline
  def apply(): GetNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResponse]
  }
  
  @scala.inline
  implicit class GetNetworkProfileResponseMutableBuilder[Self <: GetNetworkProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "NetworkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "NetworkProfile", js.undefined)
  }
}
