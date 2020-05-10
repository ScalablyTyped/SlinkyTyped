package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
  /**
    * The format in which to create the report. This can be either JSON or CSV.
    */
  var AuditReportResponseFormat: typingsSlinky.awsSdk.acmpcaMod.AuditReportResponseFormat = js.native
  /**
    * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The name of the S3 bucket that will contain the audit report.
    */
  var S3BucketName: String = js.native
}

object CreateCertificateAuthorityAuditReportRequest {
  @scala.inline
  def apply(
    AuditReportResponseFormat: AuditReportResponseFormat,
    CertificateAuthorityArn: Arn,
    S3BucketName: String
  ): CreateCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportResponseFormat = AuditReportResponseFormat.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
  }
  @scala.inline
  implicit class CreateCertificateAuthorityAuditReportRequestOps[Self <: CreateCertificateAuthorityAuditReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditReportResponseFormat(value: AuditReportResponseFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditReportResponseFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

