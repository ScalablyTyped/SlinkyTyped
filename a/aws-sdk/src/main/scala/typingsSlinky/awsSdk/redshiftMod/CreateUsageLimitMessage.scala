package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUsageLimitMessage extends js.Object {
  
  /**
    * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number. 
    */
  var Amount: Long = js.native
  
  /**
    * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about this parameter, see UsageLimit.
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  
  /**
    * The identifier of the cluster that you want to limit usage.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The Amazon Redshift feature that you want to limit.
    */
  var FeatureType: UsageLimitFeatureType = js.native
  
  /**
    * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is spectrum, then LimitType must be data-scanned. If FeatureType is concurrency-scaling, then LimitType must be time. 
    */
  var LimitType: UsageLimitLimitType = js.native
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly. 
    */
  var Period: js.UndefOr[UsageLimitPeriod] = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateUsageLimitMessage {
  
  @scala.inline
  def apply(
    Amount: Long,
    ClusterIdentifier: String,
    FeatureType: UsageLimitFeatureType,
    LimitType: UsageLimitLimitType
  ): CreateUsageLimitMessage = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], FeatureType = FeatureType.asInstanceOf[js.Any], LimitType = LimitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsageLimitMessage]
  }
  
  @scala.inline
  implicit class CreateUsageLimitMessageOps[Self <: CreateUsageLimitMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Long): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureType(value: UsageLimitFeatureType): Self = this.set("FeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitType(value: UsageLimitLimitType): Self = this.set("LimitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = this.set("BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreachAction: Self = this.set("BreachAction", js.undefined)
    
    @scala.inline
    def setPeriod(value: UsageLimitPeriod): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
