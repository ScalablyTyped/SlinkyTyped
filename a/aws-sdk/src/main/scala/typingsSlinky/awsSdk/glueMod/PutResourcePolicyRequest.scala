package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyRequest extends js.Object {
  /**
    * A value of MUST_EXIST is used to update a policy. A value of NOT_EXIST is used to create a new policy. If a value of NONE or a null value is used, the call will not depend on the existence of a policy.
    */
  var PolicyExistsCondition: js.UndefOr[ExistCondition] = js.native
  /**
    * The hash value returned when the previous policy was set using PutResourcePolicy. Its purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.native
  /**
    * Contains the policy document to set, in JSON format.
    */
  var PolicyInJson: PolicyJsonString = js.native
}

object PutResourcePolicyRequest {
  @scala.inline
  def apply(PolicyInJson: PolicyJsonString): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInJson = PolicyInJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  @scala.inline
  implicit class PutResourcePolicyRequestOps[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyInJson(value: PolicyJsonString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyInJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyExistsCondition(value: ExistCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyExistsCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyExistsCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyExistsCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyHashCondition(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHashCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyHashCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHashCondition")(js.undefined)
        ret
    }
  }
  
}

