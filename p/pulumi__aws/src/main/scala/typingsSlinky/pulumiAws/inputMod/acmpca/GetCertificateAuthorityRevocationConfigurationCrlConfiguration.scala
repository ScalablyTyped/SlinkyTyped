package typingsSlinky.pulumiAws.inputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var expirationInDays: js.UndefOr[Double] = js.native
  var s3BucketName: js.UndefOr[String] = js.native
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
  @scala.inline
  implicit class GetCertificateAuthorityRevocationConfigurationCrlConfigurationOps[Self <: GetCertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationInDays")(js.undefined)
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

