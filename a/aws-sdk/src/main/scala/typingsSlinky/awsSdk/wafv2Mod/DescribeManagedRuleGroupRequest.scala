package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeManagedRuleGroupRequest extends js.Object {
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsSlinky.awsSdk.wafv2Mod.Scope = js.native
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typingsSlinky.awsSdk.wafv2Mod.VendorName = js.native
}

object DescribeManagedRuleGroupRequest {
  @scala.inline
  def apply(Name: EntityName, Scope: Scope, VendorName: VendorName): DescribeManagedRuleGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeManagedRuleGroupRequest]
  }
  @scala.inline
  implicit class DescribeManagedRuleGroupRequestOps[Self <: DescribeManagedRuleGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorName(value: VendorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

