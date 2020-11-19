package typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingStatisticSummary extends js.Object {
  
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.native
  
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The start time of the reporting window.</p>
    */
  var Timestamp: js.UndefOr[js.Date | String | Double] = js.native
}
object SamplingStatisticSummary {
  
  @scala.inline
  def apply(): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
  
  @scala.inline
  implicit class SamplingStatisticSummaryOps[Self <: SamplingStatisticSummary] (val x: Self) extends AnyVal {
    
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
    def setBorrowCount(value: Double): Self = this.set("BorrowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorrowCount: Self = this.set("BorrowCount", js.undefined)
    
    @scala.inline
    def setRequestCount(value: Double): Self = this.set("RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCount: Self = this.set("RequestCount", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("RuleName", js.undefined)
    
    @scala.inline
    def setSampledCount(value: Double): Self = this.set("SampledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampledCount: Self = this.set("SampledCount", js.undefined)
    
    @scala.inline
    def setTimestampDate(value: js.Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date | String | Double): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
