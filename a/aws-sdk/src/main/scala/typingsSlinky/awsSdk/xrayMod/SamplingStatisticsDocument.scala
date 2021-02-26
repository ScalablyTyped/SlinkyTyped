package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingStatisticsDocument extends StObject {
  
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
  implicit class SamplingStatisticsDocumentMutableBuilder[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorrowCount(value: BorrowCount): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
    
    @scala.inline
    def setClientID(value: ClientID): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCount(value: RequestCount): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledCount(value: SampledCount): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
