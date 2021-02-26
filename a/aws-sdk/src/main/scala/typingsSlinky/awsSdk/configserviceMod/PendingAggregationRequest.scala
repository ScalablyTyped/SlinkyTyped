package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingAggregationRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The region requesting to aggregate data. 
    */
  var RequesterAwsRegion: js.UndefOr[AwsRegion] = js.native
}
object PendingAggregationRequest {
  
  @scala.inline
  def apply(): PendingAggregationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingAggregationRequest]
  }
  
  @scala.inline
  implicit class PendingAggregationRequestMutableBuilder[Self <: PendingAggregationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequesterAccountId(value: AccountId): Self = StObject.set(x, "RequesterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterAccountIdUndefined: Self = StObject.set(x, "RequesterAccountId", js.undefined)
    
    @scala.inline
    def setRequesterAwsRegion(value: AwsRegion): Self = StObject.set(x, "RequesterAwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterAwsRegionUndefined: Self = StObject.set(x, "RequesterAwsRegion", js.undefined)
  }
}
