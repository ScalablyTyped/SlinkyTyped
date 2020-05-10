package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: Input[BucketServerSideEncryptionConfigurationRule] = js.native
}

object BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(rule: Input[BucketServerSideEncryptionConfigurationRule]): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationOps[Self <: BucketServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: Input[BucketServerSideEncryptionConfigurationRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

