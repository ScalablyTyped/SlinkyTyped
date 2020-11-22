package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicyTls extends js.Object {
  
  var enforce: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The TLS validation context.
    */
  var validation: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicyTls {
  
  @scala.inline
  def apply(validation: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation): VirtualNodeSpecBackendDefaultsClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTls]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsOps[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTls] (val x: Self) extends AnyVal {
    
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
    def setValidation(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Double*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[Double]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
}
