package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy to be created.
    */
  var Policy: typingsSlinky.awsSdk.fmsMod.Policy = js.native
  /**
    * The tags to add to the AWS resource.
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.fmsMod.TagList] = js.native
}

object PutPolicyRequest {
  @scala.inline
  def apply(Policy: Policy): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
  @scala.inline
  implicit class PutPolicyRequestOps[Self <: PutPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(js.undefined)
        ret
    }
  }
  
}

