package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateAuthorityAuditReportRequest extends StObject {
  
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
  var S3BucketName: typingsSlinky.awsSdk.acmpcaMod.S3BucketName = js.native
}
object CreateCertificateAuthorityAuditReportRequest {
  
  @scala.inline
  def apply(
    AuditReportResponseFormat: AuditReportResponseFormat,
    CertificateAuthorityArn: Arn,
    S3BucketName: S3BucketName
  ): CreateCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportResponseFormat = AuditReportResponseFormat.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
  }
  
  @scala.inline
  implicit class CreateCertificateAuthorityAuditReportRequestMutableBuilder[Self <: CreateCertificateAuthorityAuditReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditReportResponseFormat(value: AuditReportResponseFormat): Self = StObject.set(x, "AuditReportResponseFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
  }
}
