package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorResponse extends StObject {
  
  /**
    * The timestamp of when the detector was created.
    */
  var CreatedAt: js.UndefOr[String] = js.native
  
  /**
    * An object that describes which data sources are enabled for the detector.
    */
  var DataSources: js.UndefOr[DataSourceConfigurationsResult] = js.native
  
  /**
    * The publishing frequency of the finding.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String = js.native
  
  /**
    * The detector status.
    */
  var Status: DetectorStatus = js.native
  
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The last-updated timestamp for the detector.
    */
  var UpdatedAt: js.UndefOr[String] = js.native
}
object GetDetectorResponse {
  
  @scala.inline
  def apply(ServiceRole: String, Status: DetectorStatus): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResponse]
  }
  
  @scala.inline
  implicit class GetDetectorResponseMutableBuilder[Self <: GetDetectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "FindingPublishingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "FindingPublishingFrequency", js.undefined)
    
    @scala.inline
    def setServiceRole(value: String): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DetectorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
