package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyVersionsResponse extends js.Object {
  /**
    * The policy versions.
    */
  var policyVersions: js.UndefOr[PolicyVersions] = js.native
}

object ListPolicyVersionsResponse {
  @scala.inline
  def apply(): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
  @scala.inline
  implicit class ListPolicyVersionsResponseOps[Self <: ListPolicyVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyVersions(value: PolicyVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersions")(js.undefined)
        ret
    }
  }
  
}

