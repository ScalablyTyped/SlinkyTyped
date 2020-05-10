package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketServerSideEncryptionRule extends js.Object {
  /**
    * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't specify any server-side encryption, this default encryption is applied.
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[AwsS3BucketServerSideEncryptionByDefault] = js.native
}

object AwsS3BucketServerSideEncryptionRule {
  @scala.inline
  def apply(): AwsS3BucketServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionRule]
  }
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionRuleOps[Self <: AwsS3BucketServerSideEncryptionRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyServerSideEncryptionByDefault(value: AwsS3BucketServerSideEncryptionByDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyServerSideEncryptionByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyServerSideEncryptionByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyServerSideEncryptionByDefault")(js.undefined)
        ret
    }
  }
  
}

