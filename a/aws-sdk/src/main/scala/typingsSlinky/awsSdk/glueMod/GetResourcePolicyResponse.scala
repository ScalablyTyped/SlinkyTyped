package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyResponse extends js.Object {
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.native
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.native
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  @scala.inline
  implicit class GetResourcePolicyResponseOps[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyHash(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHash")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyInJson(value: PolicyJsonString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyInJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyInJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyInJson")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(js.undefined)
        ret
    }
  }
  
}

