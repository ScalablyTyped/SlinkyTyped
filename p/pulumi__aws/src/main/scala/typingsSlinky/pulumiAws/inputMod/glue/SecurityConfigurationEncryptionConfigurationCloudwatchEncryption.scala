package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends js.Object {
  /**
    * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
    */
  var cloudwatchEncryptionMode: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
}

object SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  }
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOps[Self <: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchEncryptionMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchEncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchEncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchEncryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: Input[String]): Self = {
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
  }
  
}

