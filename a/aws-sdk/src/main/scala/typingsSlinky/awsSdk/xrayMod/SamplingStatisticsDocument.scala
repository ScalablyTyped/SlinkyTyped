package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingStatisticsDocument extends js.Object {
  
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typingsSlinky.awsSdk.xrayMod.BorrowCount] = js.native
  
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typingsSlinky.awsSdk.xrayMod.ClientID = js.native
  
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typingsSlinky.awsSdk.xrayMod.RequestCount = js.native
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: typingsSlinky.awsSdk.xrayMod.RuleName = js.native
  
  /**
    * The number of requests recorded.
    */
  var SampledCount: typingsSlinky.awsSdk.xrayMod.SampledCount = js.native
  
  /**
    * The current time.
    */
  var Timestamp: js.Date = js.native
}
object SamplingStatisticsDocument {
  
  @scala.inline
  def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: js.Date
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
  
  @scala.inline
  implicit class SamplingStatisticsDocumentOps[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: ClientID): Self = this.set("ClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCount(value: RequestCount): Self = this.set("RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: RuleName): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledCount(value: SampledCount): Self = this.set("SampledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorrowCount(value: BorrowCount): Self = this.set("BorrowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorrowCount: Self = this.set("BorrowCount", js.undefined)
  }
}
