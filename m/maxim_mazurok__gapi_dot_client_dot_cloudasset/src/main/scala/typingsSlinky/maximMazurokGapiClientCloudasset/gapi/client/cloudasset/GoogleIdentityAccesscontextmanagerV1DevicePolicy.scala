package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1DevicePolicy extends StObject {
  
  /** Allowed device management levels, an empty list allows all management levels. */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.native
  
  /** Allowed encryptions statuses, an empty list allows all statuses. */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.native
  
  /** Allowed OS versions, an empty list allows all types and all versions. */
  var osConstraints: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1OsConstraint]] = js.native
  
  /** Whether the device needs to be approved by the customer admin. */
  var requireAdminApproval: js.UndefOr[Boolean] = js.native
  
  /** Whether the device needs to be corp owned. */
  var requireCorpOwned: js.UndefOr[Boolean] = js.native
  
  /** Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`. */
  var requireScreenlock: js.UndefOr[Boolean] = js.native
}
object GoogleIdentityAccesscontextmanagerV1DevicePolicy {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1DevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1DevicePolicy]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1DevicePolicyMutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1DevicePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedDeviceManagementLevels(value: js.Array[String]): Self = StObject.set(x, "allowedDeviceManagementLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedDeviceManagementLevelsUndefined: Self = StObject.set(x, "allowedDeviceManagementLevels", js.undefined)
    
    @scala.inline
    def setAllowedDeviceManagementLevelsVarargs(value: String*): Self = StObject.set(x, "allowedDeviceManagementLevels", js.Array(value :_*))
    
    @scala.inline
    def setAllowedEncryptionStatuses(value: js.Array[String]): Self = StObject.set(x, "allowedEncryptionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedEncryptionStatusesUndefined: Self = StObject.set(x, "allowedEncryptionStatuses", js.undefined)
    
    @scala.inline
    def setAllowedEncryptionStatusesVarargs(value: String*): Self = StObject.set(x, "allowedEncryptionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setOsConstraints(value: js.Array[GoogleIdentityAccesscontextmanagerV1OsConstraint]): Self = StObject.set(x, "osConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsConstraintsUndefined: Self = StObject.set(x, "osConstraints", js.undefined)
    
    @scala.inline
    def setOsConstraintsVarargs(value: GoogleIdentityAccesscontextmanagerV1OsConstraint*): Self = StObject.set(x, "osConstraints", js.Array(value :_*))
    
    @scala.inline
    def setRequireAdminApproval(value: Boolean): Self = StObject.set(x, "requireAdminApproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAdminApprovalUndefined: Self = StObject.set(x, "requireAdminApproval", js.undefined)
    
    @scala.inline
    def setRequireCorpOwned(value: Boolean): Self = StObject.set(x, "requireCorpOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireCorpOwnedUndefined: Self = StObject.set(x, "requireCorpOwned", js.undefined)
    
    @scala.inline
    def setRequireScreenlock(value: Boolean): Self = StObject.set(x, "requireScreenlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireScreenlockUndefined: Self = StObject.set(x, "requireScreenlock", js.undefined)
  }
}
