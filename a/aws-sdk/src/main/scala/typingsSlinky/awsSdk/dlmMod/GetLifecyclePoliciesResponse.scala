package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePoliciesResponse extends js.Object {
  /**
    * Summary information about the lifecycle policies.
    */
  var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.native
}

object GetLifecyclePoliciesResponse {
  @scala.inline
  def apply(): GetLifecyclePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesResponse]
  }
  @scala.inline
  implicit class GetLifecyclePoliciesResponseOps[Self <: GetLifecyclePoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicies(value: LifecyclePolicySummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
  }
  
}

