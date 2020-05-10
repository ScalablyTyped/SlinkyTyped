package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Encryption extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typingsSlinky.awsSdk.glueMod.KmsKeyArn] = js.native
  /**
    * The encryption mode to use for Amazon S3 data.
    */
  var S3EncryptionMode: js.UndefOr[typingsSlinky.awsSdk.glueMod.S3EncryptionMode] = js.native
}

object S3Encryption {
  @scala.inline
  def apply(): S3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Encryption]
  }
  @scala.inline
  implicit class S3EncryptionOps[Self <: S3Encryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withS3EncryptionMode(value: S3EncryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3EncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3EncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3EncryptionMode")(js.undefined)
        ret
    }
  }
  
}

