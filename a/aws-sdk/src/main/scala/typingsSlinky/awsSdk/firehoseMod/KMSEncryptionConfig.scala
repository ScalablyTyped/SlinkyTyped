package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSEncryptionConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination Amazon S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var AWSKMSKeyARN: typingsSlinky.awsSdk.firehoseMod.AWSKMSKeyARN = js.native
}

object KMSEncryptionConfig {
  @scala.inline
  def apply(AWSKMSKeyARN: AWSKMSKeyARN): KMSEncryptionConfig = {
    val __obj = js.Dynamic.literal(AWSKMSKeyARN = AWSKMSKeyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSEncryptionConfig]
  }
  @scala.inline
  implicit class KMSEncryptionConfigOps[Self <: KMSEncryptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSKMSKeyARN(value: AWSKMSKeyARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSKMSKeyARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

