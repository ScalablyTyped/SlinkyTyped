package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEffectivePoliciesResponse extends js.Object {
  /**
    * The effective policies.
    */
  var effectivePolicies: js.UndefOr[EffectivePolicies] = js.native
}

object GetEffectivePoliciesResponse {
  @scala.inline
  def apply(): GetEffectivePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesResponse]
  }
  @scala.inline
  implicit class GetEffectivePoliciesResponseOps[Self <: GetEffectivePoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectivePolicies(value: EffectivePolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePolicies")(js.undefined)
        ret
    }
  }
  
}

