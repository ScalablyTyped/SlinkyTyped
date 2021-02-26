package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionQueryRequest extends StObject {
  
  /**
    * The maximum number of partitions to return in this call, subject to `partition_count`. For example, if `partition_count` = 10 and `page_size` = 8, the first call to PartitionQuery
    * will return up to 8 partitions and a `next_page_token` if more results exist. A second call to PartitionQuery will return up to 2 partitions, to complete the total of 10 specified
    * in `partition_count`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The `next_page_token` value returned from a previous call to PartitionQuery that may be used to get an additional set of results. There are no ordering guarantees between sets of
    * results. Thus, using multiple sets of results will require merging the different result sets. For example, two subsequent calls using a page_token may return: * cursor B, cursor M,
    * cursor Q * cursor A, cursor U, cursor W To obtain a complete result set ordered with respect to the results of the query supplied to PartitionQuery, the results sets should be
    * merged: cursor A, cursor B, cursor M, cursor Q, cursor U, cursor W
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The desired maximum number of partition points. The partitions may be returned across multiple pages of results. The number must be positive. The actual number of partitions
    * returned may be fewer. For example, this may be set to one fewer than the number of parallel queries to be run, or in running a data pipeline job, one fewer than the number of
    * workers or compute instances available.
    */
  var partitionCount: js.UndefOr[String] = js.native
  
  /**
    * A structured query. Query must specify collection with all descendants and be ordered by name ascending. Other filters, order bys, limits, offsets, and start/end cursors are not
    * supported.
    */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.native
}
object PartitionQueryRequest {
  
  @scala.inline
  def apply(): PartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionQueryRequest]
  }
  
  @scala.inline
  implicit class PartitionQueryRequestMutableBuilder[Self <: PartitionQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPartitionCount(value: String): Self = StObject.set(x, "partitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionCountUndefined: Self = StObject.set(x, "partitionCount", js.undefined)
    
    @scala.inline
    def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
