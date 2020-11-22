package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedMetricSpecification extends js.Object {
  
  /**
    * The metric type. The ALBRequestCountPerTarget metric type applies only to Spot Fleet requests and ECS services.
    */
  var PredefinedMetricType: MetricType = js.native
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Spot Fleet request or ECS service. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   This is an example: app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d. To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.ResourceLabel] = js.native
}
object PredefinedMetricSpecification {
  
  @scala.inline
  def apply(PredefinedMetricType: MetricType): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
  
  @scala.inline
  implicit class PredefinedMetricSpecificationOps[Self <: PredefinedMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPredefinedMetricType(value: MetricType): Self = this.set("PredefinedMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: ResourceLabel): Self = this.set("ResourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabel: Self = this.set("ResourceLabel", js.undefined)
  }
}
