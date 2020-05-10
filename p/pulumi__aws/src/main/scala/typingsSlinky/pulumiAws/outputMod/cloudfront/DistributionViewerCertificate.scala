package typingsSlinky.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionViewerCertificate extends js.Object {
  /**
    * The ARN of the [AWS Certificate Manager][6]
    * certificate that you wish to use with this distribution. Specify this,
    * `cloudfrontDefaultCertificate`, or `iamCertificateId`.  The ACM
    * certificate must be in  US-EAST-1.
    */
  var acmCertificateArn: js.UndefOr[String] = js.native
  /**
    * `true` if you want viewers to use HTTPS
    * to request your objects and you're using the CloudFront domain name for your
    * distribution. Specify this, `acmCertificateArn`, or `iamCertificateId`.
    */
  var cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.native
  /**
    * The IAM certificate identifier of the custom viewer
    * certificate for this distribution if you are using a custom domain. Specify
    * this, `acmCertificateArn`, or `cloudfrontDefaultCertificate`.
    */
  var iamCertificateId: js.UndefOr[String] = js.native
  /**
    * The minimum version of the SSL protocol that
    * you want CloudFront to use for HTTPS connections. Can only be set if
    * `cloudfrontDefaultCertificate = false`. One of `SSLv3`, `TLSv1`,
    * `TLSv1_2016`, `TLSv1.1_2016` or `TLSv1.2_2018`. Default: `TLSv1`. **NOTE**:
    * If you are using a custom certificate (specified with `acmCertificateArn`
    * or `iamCertificateId`), and have specified `sni-only` in
    * `sslSupportMethod`, `TLSv1` or later must be specified. If you have
    * specified `vip` in `sslSupportMethod`, only `SSLv3` or `TLSv1` can be
    * specified. If you have specified `cloudfrontDefaultCertificate`, `TLSv1`
    * must be specified.
    */
  var minimumProtocolVersion: js.UndefOr[String] = js.native
  var sslSupportMethod: js.UndefOr[String] = js.native
}

object DistributionViewerCertificate {
  @scala.inline
  def apply(): DistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionViewerCertificate]
  }
  @scala.inline
  implicit class DistributionViewerCertificateOps[Self <: DistributionViewerCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcmCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acmCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcmCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acmCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudfrontDefaultCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfrontDefaultCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudfrontDefaultCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfrontDefaultCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withIamCertificateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumProtocolVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumProtocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumProtocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSslSupportMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslSupportMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslSupportMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslSupportMethod")(js.undefined)
        ret
    }
  }
  
}

