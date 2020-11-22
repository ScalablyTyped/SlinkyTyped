package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecBackendDefaults extends js.Object {
  
  /**
    * The default client policy for virtual gateway backends.
    */
  var clientPolicy: js.UndefOr[Input[VirtualGatewaySpecBackendDefaultsClientPolicy]] = js.native
}
object VirtualGatewaySpecBackendDefaults {
  
  @scala.inline
  def apply(): VirtualGatewaySpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaults]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsOps[Self <: VirtualGatewaySpecBackendDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientPolicy(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicy]): Self = this.set("clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPolicy: Self = this.set("clientPolicy", js.undefined)
  }
}
