package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionDataRecoveryCertificate extends js.Object {
  
  // Data recovery Certificate
  var certificate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Data recovery Certificate description
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Data recovery Certificate expiration datetime
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // Data recovery Certificate subject name
  var subjectName: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionDataRecoveryCertificate {
  
  @scala.inline
  def apply(): WindowsInformationProtectionDataRecoveryCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDataRecoveryCertificate]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionDataRecoveryCertificateOps[Self <: WindowsInformationProtectionDataRecoveryCertificate] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: NullableOption[Double]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setCertificateNull: Self = this.set("certificate", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setSubjectName(value: NullableOption[String]): Self = this.set("subjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectName: Self = this.set("subjectName", js.undefined)
    
    @scala.inline
    def setSubjectNameNull: Self = this.set("subjectName", null)
  }
}
