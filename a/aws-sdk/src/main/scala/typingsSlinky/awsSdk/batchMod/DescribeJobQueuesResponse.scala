package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobQueuesResponse extends StObject {
  
  /**
    * The list of job queues.
    */
  var jobQueues: js.UndefOr[JobQueueDetailList] = js.native
  
  /**
    * The nextToken value to include in a future DescribeJobQueues request. When the results of a DescribeJobQueues request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeJobQueuesResponse {
  
  @scala.inline
  def apply(): DescribeJobQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobQueuesResponse]
  }
  
  @scala.inline
  implicit class DescribeJobQueuesResponseMutableBuilder[Self <: DescribeJobQueuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobQueues(value: JobQueueDetailList): Self = StObject.set(x, "jobQueues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueuesUndefined: Self = StObject.set(x, "jobQueues", js.undefined)
    
    @scala.inline
    def setJobQueuesVarargs(value: JobQueueDetail*): Self = StObject.set(x, "jobQueues", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
