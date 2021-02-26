package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewerCertificate extends StObject {
  
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs) and the SSL/TLS certificate is stored in AWS Certificate Manager (ACM), provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates in the US East (N. Virginia) Region (us-east-1). If you specify an ACM certificate ARN, you must also specify values for MinimumProtocolVerison and SSLSupportMethod. 
    */
  var ACMCertificateArn: js.UndefOr[String] = js.native
  
  /**
    * This field is deprecated. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var Certificate: js.UndefOr[String] = js.native
  
  /**
    * This field is deprecated. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var CertificateSource: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CertificateSource] = js.native
  
  /**
    * If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net, set this field to true. If the distribution uses Aliases (alternate domain names or CNAMEs), set this field to false and specify values for the following fields:    ACMCertificateArn or IAMCertificateId (specify a value for one, not both)    MinimumProtocolVersion     SSLSupportMethod   
    */
  var CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.native
  
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs) and the SSL/TLS certificate is stored in AWS Identity and Access Management (AWS IAM), provide the ID of the IAM certificate. If you specify an IAM certificate ID, you must also specify values for MinimumProtocolVerison and SSLSupportMethod. 
    */
  var IAMCertificateId: js.UndefOr[String] = js.native
  
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.   The ciphers that CloudFront can use to encrypt the content that it returns to viewers.   For more information, see Security Policy and Supported Protocols and Ciphers Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  On the CloudFront console, this setting is called Security Policy.  When you’re using SNI only (you set SSLSupportMethod to sni-only), you must specify TLSv1 or higher.  If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net (you set CloudFrontDefaultCertificate to true), CloudFront automatically sets the security policy to TLSv1 regardless of the value that you set here.
    */
  var MinimumProtocolVersion: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.MinimumProtocolVersion] = js.native
  
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify which viewers the distribution accepts HTTPS connections from.    sni-only – The distribution accepts HTTPS connections from only viewers that support server name indication (SNI). This is recommended. Most browsers and clients support SNI.    vip – The distribution accepts HTTPS connections from all viewers including those that don’t support SNI. This is not recommended, and results in additional monthly charges from CloudFront.    static-ip - Do not specify this value unless your distribution has been enabled for this feature by the CloudFront team. If you have a use case that requires static IP addresses for a distribution, contact CloudFront through the AWS Support Center.   If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net, don’t set a value for this field.
    */
  var SSLSupportMethod: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.SSLSupportMethod] = js.native
}
object ViewerCertificate {
  
  @scala.inline
  def apply(): ViewerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewerCertificate]
  }
  
  @scala.inline
  implicit class ViewerCertificateMutableBuilder[Self <: ViewerCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACMCertificateArn(value: String): Self = StObject.set(x, "ACMCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACMCertificateArnUndefined: Self = StObject.set(x, "ACMCertificateArn", js.undefined)
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateSource(value: CertificateSource): Self = StObject.set(x, "CertificateSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateSourceUndefined: Self = StObject.set(x, "CertificateSource", js.undefined)
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    @scala.inline
    def setCloudFrontDefaultCertificate(value: Boolean): Self = StObject.set(x, "CloudFrontDefaultCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontDefaultCertificateUndefined: Self = StObject.set(x, "CloudFrontDefaultCertificate", js.undefined)
    
    @scala.inline
    def setIAMCertificateId(value: String): Self = StObject.set(x, "IAMCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMCertificateIdUndefined: Self = StObject.set(x, "IAMCertificateId", js.undefined)
    
    @scala.inline
    def setMinimumProtocolVersion(value: MinimumProtocolVersion): Self = StObject.set(x, "MinimumProtocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumProtocolVersionUndefined: Self = StObject.set(x, "MinimumProtocolVersion", js.undefined)
    
    @scala.inline
    def setSSLSupportMethod(value: SSLSupportMethod): Self = StObject.set(x, "SSLSupportMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSLSupportMethodUndefined: Self = StObject.set(x, "SSLSupportMethod", js.undefined)
  }
}
