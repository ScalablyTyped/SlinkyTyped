package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionDataRecoveryCertificate extends js.Object {
  // Data recovery Certificate
  var certificate: js.UndefOr[Double] = js.native
  // Data recovery Certificate description
  var description: js.UndefOr[String] = js.native
  // Data recovery Certificate expiration datetime
  var expirationDateTime: js.UndefOr[String] = js.native
  // Data recovery Certificate subject name
  var subjectName: js.UndefOr[String] = js.native
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
    def withCertificate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectName")(js.undefined)
        ret
    }
  }
  
}

