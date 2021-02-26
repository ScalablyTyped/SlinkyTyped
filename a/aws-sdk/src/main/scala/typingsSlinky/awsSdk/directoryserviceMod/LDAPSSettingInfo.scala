package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDAPSSettingInfo extends StObject {
  
  /**
    * The state of the LDAPS settings.
    */
  var LDAPSStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.LDAPSStatus] = js.native
  
  /**
    * Describes a state change for LDAPS.
    */
  var LDAPSStatusReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.LDAPSStatusReason] = js.native
  
  /**
    * The date and time when the LDAPS settings were last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.native
}
object LDAPSSettingInfo {
  
  @scala.inline
  def apply(): LDAPSSettingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDAPSSettingInfo]
  }
  
  @scala.inline
  implicit class LDAPSSettingInfoMutableBuilder[Self <: LDAPSSettingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLDAPSStatus(value: LDAPSStatus): Self = StObject.set(x, "LDAPSStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDAPSStatusReason(value: LDAPSStatusReason): Self = StObject.set(x, "LDAPSStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDAPSStatusReasonUndefined: Self = StObject.set(x, "LDAPSStatusReason", js.undefined)
    
    @scala.inline
    def setLDAPSStatusUndefined: Self = StObject.set(x, "LDAPSStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
  }
}
