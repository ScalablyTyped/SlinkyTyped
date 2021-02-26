package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[Input[VirtualNodeSpecBackendDefaultsClientPolicyTls]] = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicy {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendDefaultsClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicy]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyMutableBuilder[Self <: VirtualNodeSpecBackendDefaultsClientPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: Input[VirtualNodeSpecBackendDefaultsClientPolicyTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
