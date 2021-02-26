package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisableStandardsRequest extends StObject {
  
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptionArns = js.native
}
object BatchDisableStandardsRequest {
  
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
  
  @scala.inline
  implicit class BatchDisableStandardsRequestMutableBuilder[Self <: BatchDisableStandardsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = StObject.set(x, "StandardsSubscriptionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StandardsSubscriptionArns", js.Array(value :_*))
  }
}
