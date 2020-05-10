package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DataConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to encrypt or decrypt the input and output files of a batch inference job.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The file path of the Amazon S3 bucket.
    */
  var path: S3Location = js.native
}

object S3DataConfig {
  @scala.inline
  def apply(path: S3Location): S3DataConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataConfig]
  }
  @scala.inline
  implicit class S3DataConfigOps[Self <: S3DataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: KmsKeyArn): Self = {
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

