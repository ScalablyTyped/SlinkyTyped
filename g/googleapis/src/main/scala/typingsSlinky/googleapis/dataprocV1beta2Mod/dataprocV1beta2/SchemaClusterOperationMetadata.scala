package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing the operation.
  */
@js.native
trait SchemaClusterOperationMetadata extends js.Object {
  
  /**
    * Output only. Name of the cluster for the operation.
    */
  var clusterName: js.UndefOr[String] = js.native
  
  /**
    * Output only. Cluster UUID for the operation.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  
  /**
    * Output only. Short description of operation.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Output only. Labels associated with the operation
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * Output only. Current operation status.
    */
  var status: js.UndefOr[SchemaClusterOperationStatus] = js.native
  
  /**
    * Output only. The previous operation status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaClusterOperationStatus]] = js.native
  
  /**
    * Output only. Errors encountered during operation execution.
    */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object SchemaClusterOperationMetadata {
  
  @scala.inline
  def apply(): SchemaClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaClusterOperationMetadataOps[Self <: SchemaClusterOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = this.set("clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterUuid: Self = this.set("clusterUuid", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaClusterOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusHistoryVarargs(value: SchemaClusterOperationStatus*): Self = this.set("statusHistory", js.Array(value :_*))
    
    @scala.inline
    def setStatusHistory(value: js.Array[SchemaClusterOperationStatus]): Self = this.set("statusHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusHistory: Self = this.set("statusHistory", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
