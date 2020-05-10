package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchEncryption extends js.Object {
  /**
    * The encryption mode to use for CloudWatch data.
    */
  var CloudWatchEncryptionMode: js.UndefOr[typingsSlinky.awsSdk.glueMod.CloudWatchEncryptionMode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typingsSlinky.awsSdk.glueMod.KmsKeyArn] = js.native
}

object CloudWatchEncryption {
  @scala.inline
  def apply(): CloudWatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEncryption]
  }
  @scala.inline
  implicit class CloudWatchEncryptionOps[Self <: CloudWatchEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchEncryptionMode(value: CloudWatchEncryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchEncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchEncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchEncryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: KmsKeyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(js.undefined)
        ret
    }
  }
  
}

