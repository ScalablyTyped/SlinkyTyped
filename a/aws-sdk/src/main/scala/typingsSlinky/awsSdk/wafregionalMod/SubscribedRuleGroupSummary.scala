package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribedRuleGroupSummary extends StObject {
  
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: typingsSlinky.awsSdk.wafregionalMod.MetricName = js.native
  
  /**
    * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: ResourceName = js.native
  
  /**
    * A unique identifier for a RuleGroup.
    */
  var RuleGroupId: ResourceId = js.native
}
object SubscribedRuleGroupSummary {
  
  @scala.inline
  def apply(MetricName: MetricName, Name: ResourceName, RuleGroupId: ResourceId): SubscribedRuleGroupSummary = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedRuleGroupSummary]
  }
  
  @scala.inline
  implicit class SubscribedRuleGroupSummaryMutableBuilder[Self <: SubscribedRuleGroupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
  }
}
