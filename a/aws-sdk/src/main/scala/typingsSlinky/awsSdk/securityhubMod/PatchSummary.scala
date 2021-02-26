package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchSummary extends StObject {
  
  /**
    * The number of patches from the compliance standard that failed to install.
    */
  var FailedCount: js.UndefOr[Integer] = js.native
  
  /**
    * The identifier of the compliance standard that was used to determine the patch compliance status.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The number of patches from the compliance standard that were installed successfully.
    */
  var InstalledCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of installed patches that are not part of the compliance standard.
    */
  var InstalledOtherCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as installed.
    */
  var InstalledPendingReboot: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that are installed but are also on a list of patches that the customer rejected.
    */
  var InstalledRejectedCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that are part of the compliance standard but are not installed. The count includes patches that failed to install.
    */
  var MissingCount: js.UndefOr[Integer] = js.native
  
  /**
    * The type of patch operation performed. For Patch Manager, the values are SCAN and INSTALL. 
    */
  var Operation: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the operation completed. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationEndTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the operation started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationStartTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The reboot option specified for the instance.
    */
  var RebootOption: js.UndefOr[NonEmptyString] = js.native
}
object PatchSummary {
  
  @scala.inline
  def apply(Id: NonEmptyString): PatchSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchSummary]
  }
  
  @scala.inline
  implicit class PatchSummaryMutableBuilder[Self <: PatchSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedCount(value: Integer): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCountUndefined: Self = StObject.set(x, "FailedCount", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledCount(value: Integer): Self = StObject.set(x, "InstalledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledCountUndefined: Self = StObject.set(x, "InstalledCount", js.undefined)
    
    @scala.inline
    def setInstalledOtherCount(value: Integer): Self = StObject.set(x, "InstalledOtherCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledOtherCountUndefined: Self = StObject.set(x, "InstalledOtherCount", js.undefined)
    
    @scala.inline
    def setInstalledPendingReboot(value: Integer): Self = StObject.set(x, "InstalledPendingReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledPendingRebootUndefined: Self = StObject.set(x, "InstalledPendingReboot", js.undefined)
    
    @scala.inline
    def setInstalledRejectedCount(value: Integer): Self = StObject.set(x, "InstalledRejectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledRejectedCountUndefined: Self = StObject.set(x, "InstalledRejectedCount", js.undefined)
    
    @scala.inline
    def setMissingCount(value: Integer): Self = StObject.set(x, "MissingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingCountUndefined: Self = StObject.set(x, "MissingCount", js.undefined)
    
    @scala.inline
    def setOperation(value: NonEmptyString): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationEndTime(value: NonEmptyString): Self = StObject.set(x, "OperationEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationEndTimeUndefined: Self = StObject.set(x, "OperationEndTime", js.undefined)
    
    @scala.inline
    def setOperationStartTime(value: NonEmptyString): Self = StObject.set(x, "OperationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStartTimeUndefined: Self = StObject.set(x, "OperationStartTime", js.undefined)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    @scala.inline
    def setRebootOption(value: NonEmptyString): Self = StObject.set(x, "RebootOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootOptionUndefined: Self = StObject.set(x, "RebootOption", js.undefined)
  }
}
