package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationS3Encryption extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
  /**
    * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
    */
  var s3EncryptionMode: js.UndefOr[String] = js.native
}

object SecurityConfigurationEncryptionConfigurationS3Encryption {
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationS3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationS3Encryption]
  }
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationS3EncryptionOps[Self <: SecurityConfigurationEncryptionConfigurationS3Encryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3EncryptionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3EncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3EncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3EncryptionMode")(js.undefined)
        ret
    }
  }
  
}

