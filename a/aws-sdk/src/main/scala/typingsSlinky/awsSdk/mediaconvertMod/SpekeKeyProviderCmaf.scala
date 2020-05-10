package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpekeKeyProviderCmaf extends js.Object {
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[stringPatternArnAwsUsGovAcm] = js.native
  /**
    * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var DashSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  /**
    * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var HlsSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[stringPatternW] = js.native
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[stringPatternHttps] = js.native
}

object SpekeKeyProviderCmaf {
  @scala.inline
  def apply(): SpekeKeyProviderCmaf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpekeKeyProviderCmaf]
  }
  @scala.inline
  implicit class SpekeKeyProviderCmafOps[Self <: SpekeKeyProviderCmaf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: stringPatternArnAwsUsGovAcm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDashSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashSignaledSystemIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashSignaledSystemIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashSignaledSystemIds")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsSignaledSystemIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsSignaledSystemIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsSignaledSystemIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: stringPatternW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: stringPatternHttps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

