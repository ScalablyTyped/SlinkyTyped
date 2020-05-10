package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePolicyResponse extends js.Object {
  /**
    * The contents of the effective policy.
    */
  var EffectivePolicy: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.EffectivePolicy] = js.native
}

object DescribeEffectivePolicyResponse {
  @scala.inline
  def apply(): DescribeEffectivePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePolicyResponse]
  }
  @scala.inline
  implicit class DescribeEffectivePolicyResponseOps[Self <: DescribeEffectivePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectivePolicy(value: EffectivePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePolicy")(js.undefined)
        ret
    }
  }
  
}

