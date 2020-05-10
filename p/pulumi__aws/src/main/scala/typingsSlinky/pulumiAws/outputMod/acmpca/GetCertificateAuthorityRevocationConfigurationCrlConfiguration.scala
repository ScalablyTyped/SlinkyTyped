package typingsSlinky.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: String = js.native
  var enabled: Boolean = js.native
  var expirationInDays: Double = js.native
  var s3BucketName: String = js.native
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(customCname: String, enabled: Boolean, expirationInDays: Double, s3BucketName: String): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(customCname = customCname.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationInDays = expirationInDays.asInstanceOf[js.Any], s3BucketName = s3BucketName.asInstanceOf[js.Any])
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

