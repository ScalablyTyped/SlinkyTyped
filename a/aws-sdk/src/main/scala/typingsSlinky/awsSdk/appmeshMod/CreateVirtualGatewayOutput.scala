package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualGatewayOutput extends StObject {
  
  /**
    * The full description of your virtual gateway following the create call.
    */
  var virtualGateway: VirtualGatewayData = js.native
}
object CreateVirtualGatewayOutput {
  
  @scala.inline
  def apply(virtualGateway: VirtualGatewayData): CreateVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualGatewayOutput]
  }
  
  @scala.inline
  implicit class CreateVirtualGatewayOutputMutableBuilder[Self <: CreateVirtualGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
