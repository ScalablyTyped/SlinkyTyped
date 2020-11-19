package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmClientCertificateResult extends js.Object {
  
  var HsmClientCertificate: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.HsmClientCertificate] = js.native
}
object CreateHsmClientCertificateResult {
  
  @scala.inline
  def apply(): CreateHsmClientCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmClientCertificateResult]
  }
  
  @scala.inline
  implicit class CreateHsmClientCertificateResultOps[Self <: CreateHsmClientCertificateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHsmClientCertificate(value: HsmClientCertificate): Self = this.set("HsmClientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmClientCertificate: Self = this.set("HsmClientCertificate", js.undefined)
  }
}
