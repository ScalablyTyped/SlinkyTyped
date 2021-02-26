package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkGroupConfigurationUpdates extends StObject {
  
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.native
  
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * If set to true, allows members assigned to a workgroup to specify Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultConfigurationUpdates] = js.native
}
object WorkGroupConfigurationUpdates {
  
  @scala.inline
  def apply(): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
  
  @scala.inline
  implicit class WorkGroupConfigurationUpdatesMutableBuilder[Self <: WorkGroupConfigurationUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = StObject.set(x, "BytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "BytesScannedCutoffPerQuery", js.undefined)
    
    @scala.inline
    def setEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = StObject.set(x, "EnforceWorkGroupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceWorkGroupConfigurationUndefined: Self = StObject.set(x, "EnforceWorkGroupConfiguration", js.undefined)
    
    @scala.inline
    def setPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", js.undefined)
    
    @scala.inline
    def setRemoveBytesScannedCutoffPerQuery(value: BoxedBoolean): Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", js.undefined)
    
    @scala.inline
    def setRequesterPaysEnabled(value: BoxedBoolean): Self = StObject.set(x, "RequesterPaysEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPaysEnabledUndefined: Self = StObject.set(x, "RequesterPaysEnabled", js.undefined)
    
    @scala.inline
    def setResultConfigurationUpdates(value: ResultConfigurationUpdates): Self = StObject.set(x, "ResultConfigurationUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultConfigurationUpdatesUndefined: Self = StObject.set(x, "ResultConfigurationUpdates", js.undefined)
  }
}
