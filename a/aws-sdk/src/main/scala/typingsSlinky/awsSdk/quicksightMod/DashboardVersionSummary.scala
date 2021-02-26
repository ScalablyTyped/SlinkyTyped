package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The time that this dashboard version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Description.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  
  /**
    * Source entity ARN.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * Version number.
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}
object DashboardVersionSummary {
  
  @scala.inline
  def apply(): DashboardVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardVersionSummary]
  }
  
  @scala.inline
  implicit class DashboardVersionSummaryMutableBuilder[Self <: DashboardVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSourceEntityArn(value: Arn): Self = StObject.set(x, "SourceEntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEntityArnUndefined: Self = StObject.set(x, "SourceEntityArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
