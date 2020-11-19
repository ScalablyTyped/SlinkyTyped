package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedLoadMetricSpecification extends js.Object {
  
  /**
    * The metric type.
    */
  var PredefinedLoadMetricType: LoadMetricType = js.native
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ResourceLabel] = js.native
}
object PredefinedLoadMetricSpecification {
  
  @scala.inline
  def apply(PredefinedLoadMetricType: LoadMetricType): PredefinedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedLoadMetricType = PredefinedLoadMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedLoadMetricSpecification]
  }
  
  @scala.inline
  implicit class PredefinedLoadMetricSpecificationOps[Self <: PredefinedLoadMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setPredefinedLoadMetricType(value: LoadMetricType): Self = this.set("PredefinedLoadMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: ResourceLabel): Self = this.set("ResourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabel: Self = this.set("ResourceLabel", js.undefined)
  }
}
