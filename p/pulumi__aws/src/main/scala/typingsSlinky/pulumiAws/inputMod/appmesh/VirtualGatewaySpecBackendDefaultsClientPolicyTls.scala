package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecBackendDefaultsClientPolicyTls extends js.Object {
  
  var enforce: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
  
  /**
    * The TLS validation context.
    */
  var validation: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation] = js.native
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTls {
  
  @scala.inline
  def apply(validation: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation]): VirtualGatewaySpecBackendDefaultsClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTls]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsOps[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTls] (val x: Self) extends AnyVal {
    
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
    def setValidation(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation]): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce(value: Input[Boolean]): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[Double]*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[Double]]]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
}
