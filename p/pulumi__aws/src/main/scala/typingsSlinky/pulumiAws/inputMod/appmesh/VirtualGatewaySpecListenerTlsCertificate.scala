package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListenerTlsCertificate extends StObject {
  
  /**
    * An AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[Input[VirtualGatewaySpecListenerTlsCertificateAcm]] = js.native
  
  /**
    * A local file certificate.
    */
  var file: js.UndefOr[Input[VirtualGatewaySpecListenerTlsCertificateFile]] = js.native
}
object VirtualGatewaySpecListenerTlsCertificate {
  
  @scala.inline
  def apply(): VirtualGatewaySpecListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificate]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsCertificateMutableBuilder[Self <: VirtualGatewaySpecListenerTlsCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: Input[VirtualGatewaySpecListenerTlsCertificateAcm]): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: Input[VirtualGatewaySpecListenerTlsCertificateFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
