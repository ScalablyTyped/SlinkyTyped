package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteDocumentRequest extends StObject {
  
  var DataSourceSyncJobMetricTarget: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DataSourceSyncJobMetricTarget] = js.native
  
  /**
    * One or more identifiers for documents to delete from the index.
    */
  var DocumentIdList: typingsSlinky.awsSdk.kendraMod.DocumentIdList = js.native
  
  /**
    * The identifier of the index that contains the documents to delete.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
}
object BatchDeleteDocumentRequest {
  
  @scala.inline
  def apply(DocumentIdList: DocumentIdList, IndexId: IndexId): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteDocumentRequestMutableBuilder[Self <: BatchDeleteDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceSyncJobMetricTarget(value: DataSourceSyncJobMetricTarget): Self = StObject.set(x, "DataSourceSyncJobMetricTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceSyncJobMetricTargetUndefined: Self = StObject.set(x, "DataSourceSyncJobMetricTarget", js.undefined)
    
    @scala.inline
    def setDocumentIdList(value: DocumentIdList): Self = StObject.set(x, "DocumentIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdListVarargs(value: DocumentId*): Self = StObject.set(x, "DocumentIdList", js.Array(value :_*))
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
