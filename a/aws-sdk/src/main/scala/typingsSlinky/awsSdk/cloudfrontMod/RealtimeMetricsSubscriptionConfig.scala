package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeMetricsSubscriptionConfig extends js.Object {
  
  /**
    * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var RealtimeMetricsSubscriptionStatus: typingsSlinky.awsSdk.cloudfrontMod.RealtimeMetricsSubscriptionStatus = js.native
}
object RealtimeMetricsSubscriptionConfig {
  
  @scala.inline
  def apply(RealtimeMetricsSubscriptionStatus: RealtimeMetricsSubscriptionStatus): RealtimeMetricsSubscriptionConfig = {
    val __obj = js.Dynamic.literal(RealtimeMetricsSubscriptionStatus = RealtimeMetricsSubscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeMetricsSubscriptionConfig]
  }
  
  @scala.inline
  implicit class RealtimeMetricsSubscriptionConfigOps[Self <: RealtimeMetricsSubscriptionConfig] (val x: Self) extends AnyVal {
    
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
    def setRealtimeMetricsSubscriptionStatus(value: RealtimeMetricsSubscriptionStatus): Self = this.set("RealtimeMetricsSubscriptionStatus", value.asInstanceOf[js.Any])
  }
}
