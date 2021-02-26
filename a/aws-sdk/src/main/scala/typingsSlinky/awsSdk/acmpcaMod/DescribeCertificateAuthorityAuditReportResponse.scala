package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateAuthorityAuditReportResponse extends StObject {
  
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
  var S3BucketName: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.S3BucketName] = js.native
  
  /**
    * S3 key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.S3Key] = js.native
}
object DescribeCertificateAuthorityAuditReportResponse {
  
  @scala.inline
  def apply(): DescribeCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificateAuthorityAuditReportResponseMutableBuilder[Self <: DescribeCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditReportStatus(value: AuditReportStatus): Self = StObject.set(x, "AuditReportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditReportStatusUndefined: Self = StObject.set(x, "AuditReportStatus", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
