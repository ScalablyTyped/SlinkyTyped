package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfigurationRule extends js.Object {
  /**
    * A single object for setting server-side encryption by default. (documented below)
    */
  var applyServerSideEncryptionByDefault: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault] = js.native
}

object BucketServerSideEncryptionConfigurationRule {
  @scala.inline
  def apply(
    applyServerSideEncryptionByDefault: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  ): BucketServerSideEncryptionConfigurationRule = {
    val __obj = js.Dynamic.literal(applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRule]
  }
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationRuleOps[Self <: BucketServerSideEncryptionConfigurationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyServerSideEncryptionByDefault(value: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyServerSideEncryptionByDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

