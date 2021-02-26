package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDestination extends StObject {
  
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[string] = js.native
  
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[string] = js.native
  
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[string] = js.native
  
  var Vpc: js.UndefOr[InputDestinationVpc] = js.native
}
object InputDestination {
  
  @scala.inline
  def apply(): InputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestination]
  }
  
  @scala.inline
  implicit class InputDestinationMutableBuilder[Self <: InputDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: string): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    @scala.inline
    def setPort(value: string): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setVpc(value: InputDestinationVpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
