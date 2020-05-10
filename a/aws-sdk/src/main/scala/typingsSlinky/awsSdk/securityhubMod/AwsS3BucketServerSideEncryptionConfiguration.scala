package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var Rules: js.UndefOr[AwsS3BucketServerSideEncryptionRules] = js.native
}

object AwsS3BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(): AwsS3BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionConfigurationOps[Self <: AwsS3BucketServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: AwsS3BucketServerSideEncryptionRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

