package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyStatusOutput extends js.Object {
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PolicyStatus] = js.native
}

object GetBucketPolicyStatusOutput {
  @scala.inline
  def apply(): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
  @scala.inline
  implicit class GetBucketPolicyStatusOutputOps[Self <: GetBucketPolicyStatusOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyStatus(value: PolicyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyStatus")(js.undefined)
        ret
    }
  }
  
}

