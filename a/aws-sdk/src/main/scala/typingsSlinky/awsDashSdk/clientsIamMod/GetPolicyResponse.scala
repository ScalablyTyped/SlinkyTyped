package typingsSlinky.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResponse extends js.Object {
  /**
    * A structure containing details about the policy.
    */
  var Policy: js.UndefOr[typingsSlinky.awsDashSdk.clientsIamMod.Policy] = js.native
}

object GetPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

