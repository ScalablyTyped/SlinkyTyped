package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerCertificate extends js.Object {
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
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.   The ciphers that CloudFront can use to encrypt the content that it returns to viewers.   For more information, see Security Policy and Supported Protocols and Ciphers Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  On the CloudFront console, this setting is called Security Policy.  We recommend that you specify TLSv1.2_2018 unless your viewers are using browsers or devices that don’t support TLSv1.2. When you’re using SNI only (you set SSLSupportMethod to sni-only), you must specify TLSv1 or higher.  If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net (you set CloudFrontDefaultCertificate to true), CloudFront automatically sets the security policy to TLSv1 regardless of the value that you set here.
    */
  var MinimumProtocolVersion: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.MinimumProtocolVersion] = js.native
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify which viewers the distribution accepts HTTPS connections from.    sni-only – The distribution accepts HTTPS connections from only viewers that support server name indication (SNI). This is recommended. Most browsers and clients released after 2010 support SNI.    vip – The distribution accepts HTTPS connections from all viewers including those that don’t support SNI. This is not recommended, and results in additional monthly charges from CloudFront.   If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net, don’t set a value for this field.
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
  implicit class ViewerCertificateOps[Self <: ViewerCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACMCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACMCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACMCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACMCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateSource(value: CertificateSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudFrontDefaultCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontDefaultCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFrontDefaultCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontDefaultCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMCertificateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumProtocolVersion(value: MinimumProtocolVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumProtocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumProtocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSSLSupportMethod(value: SSLSupportMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSLSupportMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSLSupportMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSLSupportMethod")(js.undefined)
        ret
    }
  }
  
}

