package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesRequest extends StObject {
  
  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  var ListBy: js.UndefOr[QueueListBy] = js.native
  
  /**
    * Optional. Number of queues, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Order] = js.native
}
object ListQueuesRequest {
  
  @scala.inline
  def apply(): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesRequest]
  }
  
  @scala.inline
  implicit class ListQueuesRequestMutableBuilder[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListBy(value: QueueListBy): Self = StObject.set(x, "ListBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListByUndefined: Self = StObject.set(x, "ListBy", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integerMin1Max20): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
