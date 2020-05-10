package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersionIdentifier extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object PolicyVersionIdentifier {
  @scala.inline
  def apply(): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
  @scala.inline
  implicit class PolicyVersionIdentifierOps[Self <: PolicyVersionIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyVersionId(value: PolicyVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionId")(js.undefined)
        ret
    }
  }
  
}

