package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
  /**
    * An alphanumeric string that contains a report identifier.
    */
  var AuditReportId: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.AuditReportId] = js.native
  /**
    * The key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.native
}

object CreateCertificateAuthorityAuditReportResponse {
  @scala.inline
  def apply(): CreateCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportResponse]
  }
  @scala.inline
  implicit class CreateCertificateAuthorityAuditReportResponseOps[Self <: CreateCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditReportId(value: AuditReportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditReportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditReportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditReportId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Key")(js.undefined)
        ret
    }
  }
  
}

