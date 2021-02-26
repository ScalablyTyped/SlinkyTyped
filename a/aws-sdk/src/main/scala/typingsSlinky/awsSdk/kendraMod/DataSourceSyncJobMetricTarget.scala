package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSyncJobMetricTarget extends StObject {
  
  /**
    * The ID of the data source that is running the sync job.
    */
  var DataSourceId: typingsSlinky.awsSdk.kendraMod.DataSourceId = js.native
  
  /**
    * The ID of the sync job that is running on the data source.
    */
  var DataSourceSyncJobId: typingsSlinky.awsSdk.kendraMod.DataSourceSyncJobId = js.native
}
object DataSourceSyncJobMetricTarget {
  
  @scala.inline
  def apply(DataSourceId: DataSourceId, DataSourceSyncJobId: DataSourceSyncJobId): DataSourceSyncJobMetricTarget = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSourceSyncJobId = DataSourceSyncJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSyncJobMetricTarget]
  }
  
  @scala.inline
  implicit class DataSourceSyncJobMetricTargetMutableBuilder[Self <: DataSourceSyncJobMetricTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceSyncJobId(value: DataSourceSyncJobId): Self = StObject.set(x, "DataSourceSyncJobId", value.asInstanceOf[js.Any])
  }
}
