package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountModification extends StObject {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  
  /**
    * The status of BYOL (whether BYOL is being enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.native
  
  /**
    * The error code that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  
  /**
    * The text of the error message that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  
  /**
    * The state of the modification to the configuration of BYOL.
    */
  var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.native
  
  /**
    * The timestamp when the modification of the BYOL configuration was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}
object AccountModification {
  
  @scala.inline
  def apply(): AccountModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountModification]
  }
  
  @scala.inline
  implicit class AccountModificationMutableBuilder[Self <: AccountModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRangeUndefined: Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", js.undefined)
    
    @scala.inline
    def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = StObject.set(x, "DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancySupportUndefined: Self = StObject.set(x, "DedicatedTenancySupport", js.undefined)
    
    @scala.inline
    def setErrorCode(value: WorkspaceErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setModificationState(value: DedicatedTenancyModificationStateEnum): Self = StObject.set(x, "ModificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationStateUndefined: Self = StObject.set(x, "ModificationState", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
