package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppliedConditionalAccessPolicy extends js.Object {
  // Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
  var displayName: js.UndefOr[String] = js.native
  /**
    * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor
    * authentication').
    */
  var enforcedGrantControls: js.UndefOr[js.Array[String]] = js.native
  // Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
  var enforcedSessionControls: js.UndefOr[js.Array[String]] = js.native
  // Unique GUID of the conditional access polic.y
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates the result of the CA policy that was triggered. Possible values are:successfailurenotApplied - Policy isn't
    * applied because policy conditions were not met.notEnabled - This is due to the policy in disabled state.
    */
  var result: js.UndefOr[AppliedConditionalAccessPolicyResult] = js.native
}

object AppliedConditionalAccessPolicy {
  @scala.inline
  def apply(): AppliedConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedConditionalAccessPolicy]
  }
  @scala.inline
  implicit class AppliedConditionalAccessPolicyOps[Self <: AppliedConditionalAccessPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcedGrantControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcedGrantControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcedGrantControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcedGrantControls")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcedSessionControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcedSessionControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcedSessionControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcedSessionControls")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: AppliedConditionalAccessPolicyResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

