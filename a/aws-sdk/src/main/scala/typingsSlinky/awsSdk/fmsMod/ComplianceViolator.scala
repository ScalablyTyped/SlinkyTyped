package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceViolator extends js.Object {
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceId] = js.native
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceType] = js.native
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ViolationReason] = js.native
}

object ComplianceViolator {
  @scala.inline
  def apply(): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceViolator]
  }
  @scala.inline
  implicit class ComplianceViolatorOps[Self <: ComplianceViolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withViolationReason(value: ViolationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViolationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolationReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViolationReason")(js.undefined)
        ret
    }
  }
  
}

