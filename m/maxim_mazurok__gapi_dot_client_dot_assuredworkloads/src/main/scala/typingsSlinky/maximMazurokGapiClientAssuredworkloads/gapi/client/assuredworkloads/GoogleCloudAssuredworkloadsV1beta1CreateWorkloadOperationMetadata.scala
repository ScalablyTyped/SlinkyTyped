package typingsSlinky.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadata extends StObject {
  
  /** Optional. Compliance controls that should be applied to the resources managed by the workload. */
  var complianceRegime: js.UndefOr[String] = js.native
  
  /** Optional. Time when the operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. The display name of the workload. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. The parent of the workload. */
  var parent: js.UndefOr[String] = js.native
}
object GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadataMutableBuilder[Self <: GoogleCloudAssuredworkloadsV1beta1CreateWorkloadOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
