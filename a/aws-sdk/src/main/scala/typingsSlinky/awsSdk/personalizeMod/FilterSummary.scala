package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSummary extends StObject {
  
  /**
    * The time at which the filter was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the dataset group to which the filter belongs.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * If the filter failed, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The ARN of the filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  
  /**
    * The time at which the filter was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the filter.
    */
  var status: js.UndefOr[Status] = js.native
}
object FilterSummary {
  
  @scala.inline
  def apply(): FilterSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSummary]
  }
  
  @scala.inline
  implicit class FilterSummaryMutableBuilder[Self <: FilterSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
