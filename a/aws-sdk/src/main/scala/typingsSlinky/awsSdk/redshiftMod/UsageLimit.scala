package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageLimit extends StObject {
  
  /**
    * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
    */
  var Amount: js.UndefOr[Long] = js.native
  
  /**
    * The action that Amazon Redshift takes when the limit is reached. Possible values are:     log - To log an event in a system table. The default is log.    emit-metric - To emit CloudWatch metrics.    disable - To disable the feature until the next usage period begins.  
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  
  /**
    * The identifier of the cluster with a usage limit.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Redshift feature to which the limit applies.
    */
  var FeatureType: js.UndefOr[UsageLimitFeatureType] = js.native
  
  /**
    * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
    */
  var LimitType: js.UndefOr[UsageLimitLimitType] = js.native
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly. 
    */
  var Period: js.UndefOr[UsageLimitPeriod] = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The identifier of the usage limit.
    */
  var UsageLimitId: js.UndefOr[String] = js.native
}
object UsageLimit {
  
  @scala.inline
  def apply(): UsageLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageLimit]
  }
  
  @scala.inline
  implicit class UsageLimitMutableBuilder[Self <: UsageLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Long): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachActionUndefined: Self = StObject.set(x, "BreachAction", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setFeatureType(value: UsageLimitFeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "FeatureType", js.undefined)
    
    @scala.inline
    def setLimitType(value: UsageLimitLimitType): Self = StObject.set(x, "LimitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitTypeUndefined: Self = StObject.set(x, "LimitType", js.undefined)
    
    @scala.inline
    def setPeriod(value: UsageLimitPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageLimitIdUndefined: Self = StObject.set(x, "UsageLimitId", js.undefined)
  }
}
