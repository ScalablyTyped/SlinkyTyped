package typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SetIamPolicyRequest. */
@js.native
trait ISetIamPolicyRequest extends js.Object {
  /** SetIamPolicyRequest policy */
  var policy: js.UndefOr[IPolicy | Null] = js.native
  /** SetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.native
}

object ISetIamPolicyRequest {
  @scala.inline
  def apply(): ISetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetIamPolicyRequest]
  }
  @scala.inline
  implicit class ISetIamPolicyRequestOps[Self <: ISetIamPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: IPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(null)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(null)
        ret
    }
  }
  
}

