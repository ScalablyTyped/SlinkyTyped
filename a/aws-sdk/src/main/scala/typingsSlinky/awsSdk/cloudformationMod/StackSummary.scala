package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSummary extends StObject {
  
  /**
    * The time the stack was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.native
  
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.native
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.native
  
  /**
    * Unique stack identifier.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The name associated with the stack.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
  
  /**
    * The current status of the stack.
    */
  var StackStatus: typingsSlinky.awsSdk.cloudformationMod.StackStatus = js.native
  
  /**
    * Success/Failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackStatusReason] = js.native
  
  /**
    * The template description of the template used to create the stack.
    */
  var TemplateDescription: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateDescription] = js.native
}
object StackSummary {
  
  @scala.inline
  def apply(CreationTime: js.Date, StackName: StackName, StackStatus: StackStatus): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
  
  @scala.inline
  implicit class StackSummaryMutableBuilder[Self <: StackSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTime(value: js.Date): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    @scala.inline
    def setDriftInformation(value: StackDriftInformationSummary): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setParentId(value: StackId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    @scala.inline
    def setRootId(value: StackId): Self = StObject.set(x, "RootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootIdUndefined: Self = StObject.set(x, "RootId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatus(value: StackStatus): Self = StObject.set(x, "StackStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatusReason(value: StackStatusReason): Self = StObject.set(x, "StackStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatusReasonUndefined: Self = StObject.set(x, "StackStatusReason", js.undefined)
    
    @scala.inline
    def setTemplateDescription(value: TemplateDescription): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
  }
}
