package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateInfo extends js.Object {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CertificateId] = js.native
  
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.native
  
  /**
    * The date and time when the certificate will expire.
    */
  var ExpiryDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
}
object CertificateInfo {
  
  @scala.inline
  def apply(): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateInfo]
  }
  
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    
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
    def setCertificateId(value: CertificateId): Self = this.set("CertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateId: Self = this.set("CertificateId", js.undefined)
    
    @scala.inline
    def setCommonName(value: CertificateCN): Self = this.set("CommonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonName: Self = this.set("CommonName", js.undefined)
    
    @scala.inline
    def setExpiryDateTime(value: js.Date): Self = this.set("ExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryDateTime: Self = this.set("ExpiryDateTime", js.undefined)
    
    @scala.inline
    def setState(value: CertificateState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
