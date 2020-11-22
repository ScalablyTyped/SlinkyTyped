package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListenerTlsCertificate extends js.Object {
  
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
  implicit class VirtualGatewaySpecListenerTlsCertificateOps[Self <: VirtualGatewaySpecListenerTlsCertificate] (val x: Self) extends AnyVal {
    
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
    def setAcm(value: Input[VirtualGatewaySpecListenerTlsCertificateAcm]): Self = this.set("acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcm: Self = this.set("acm", js.undefined)
    
    @scala.inline
    def setFile(value: Input[VirtualGatewaySpecListenerTlsCertificateFile]): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
