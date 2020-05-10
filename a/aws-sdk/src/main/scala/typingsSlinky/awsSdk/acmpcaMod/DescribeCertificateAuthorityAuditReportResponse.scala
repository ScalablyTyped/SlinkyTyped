package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
  /**
    * Specifies whether report creation is in progress, has succeeded, or has failed.
    */
  var AuditReportStatus: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.AuditReportStatus] = js.native
  /**
    * The date and time at which the report was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * Name of the S3 bucket that contains the report.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * S3 key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.native
}

object DescribeCertificateAuthorityAuditReportResponse {
  @scala.inline
  def apply(): DescribeCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
  @scala.inline
  implicit class DescribeCertificateAuthorityAuditReportResponseOps[Self <: DescribeCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditReportStatus(value: AuditReportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditReportStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditReportStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditReportStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(js.undefined)
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

