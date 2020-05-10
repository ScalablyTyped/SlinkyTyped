package typingsSlinky.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
    */
  var customCname: js.UndefOr[String] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Number of days until a certificate expires. Must be between 1 and 5000.
    */
  var expirationInDays: Double = js.native
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
    */
  var s3BucketName: js.UndefOr[String] = js.native
}

object CertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(expirationInDays: Double): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
  @scala.inline
  implicit class CertificateAuthorityRevocationConfigurationCrlConfigurationOps[Self <: CertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomCname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCname")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(js.undefined)
        ret
    }
  }
  
}

