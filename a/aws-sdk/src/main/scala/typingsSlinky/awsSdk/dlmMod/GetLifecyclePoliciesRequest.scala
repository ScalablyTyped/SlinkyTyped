package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePoliciesRequest extends js.Object {
  /**
    * The identifiers of the data lifecycle policies.
    */
  var PolicyIds: js.UndefOr[PolicyIdList] = js.native
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.native
  /**
    * The activation state.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  /**
    * The tags to add to objects created by the policy. Tags are strings in the format key=value. These user-defined tags are added in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.native
  /**
    * The target tag for a policy. Tags are strings in the format key=value.
    */
  var TargetTags: js.UndefOr[TargetTagsFilterList] = js.native
}

object GetLifecyclePoliciesRequest {
  @scala.inline
  def apply(): GetLifecyclePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesRequest]
  }
  @scala.inline
  implicit class GetLifecyclePoliciesRequestOps[Self <: GetLifecyclePoliciesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyIds(value: PolicyIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypes(value: ResourceTypeValuesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: GettablePolicyStateValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsToAdd(value: TagsToAddFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTags(value: TargetTagsFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTags")(js.undefined)
        ret
    }
  }
  
}

