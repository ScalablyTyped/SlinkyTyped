package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebACLRequest extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected, either an application load balancer or Amazon API Gateway stage.  The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
    */
  var ResourceArn: typingsSlinky.awsSdk.wafregionalMod.ResourceArn = js.native
  /**
    * A unique identifier (ID) for the web ACL. 
    */
  var WebACLId: ResourceId = js.native
}

object AssociateWebACLRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, WebACLId: ResourceId): AssociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebACLRequest]
  }
  @scala.inline
  implicit class AssociateWebACLRequestOps[Self <: AssociateWebACLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebACLId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

