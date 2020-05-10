package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceInformation extends js.Object {
  // Collection of the certification controls associated with certification
  var certificationControls: js.UndefOr[js.Array[CertificationControl]] = js.native
  // Compliance certification name (for example, ISO 27018:2014, GDPR, FedRAMP, NIST 800-171)
  var certificationName: js.UndefOr[String] = js.native
}

object ComplianceInformation {
  @scala.inline
  def apply(): ComplianceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceInformation]
  }
  @scala.inline
  implicit class ComplianceInformationOps[Self <: ComplianceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificationControls(value: js.Array[CertificationControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificationControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationControls")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationName")(js.undefined)
        ret
    }
  }
  
}

