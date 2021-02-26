package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the Rule.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.wafMod.MetricName] = js.native
  
  /**
    * The friendly name or description for the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a Rule.
    */
  var Predicates: typingsSlinky.awsSdk.wafMod.Predicates = js.native
  
  /**
    * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
}
object Rule {
  
  @scala.inline
  def apply(Predicates: Predicates, RuleId: ResourceId): Rule = {
    val __obj = js.Dynamic.literal(Predicates = Predicates.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPredicates(value: Predicates): Self = StObject.set(x, "Predicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicatesVarargs(value: Predicate*): Self = StObject.set(x, "Predicates", js.Array(value :_*))
    
    @scala.inline
    def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
