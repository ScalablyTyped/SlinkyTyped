package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trust extends StObject {
  
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Directory ID of the AWS directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustDirection] = js.native
  
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustId] = js.native
  
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustState] = js.native
  
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustStateReason] = js.native
  
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustType] = js.native
}
object Trust {
  
  @scala.inline
  def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  
  @scala.inline
  implicit class TrustMutableBuilder[Self <: Trust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDomainNameUndefined: Self = StObject.set(x, "RemoteDomainName", js.undefined)
    
    @scala.inline
    def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    @scala.inline
    def setStateLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "StateLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StateLastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setTrustDirection(value: TrustDirection): Self = StObject.set(x, "TrustDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustDirectionUndefined: Self = StObject.set(x, "TrustDirection", js.undefined)
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
    
    @scala.inline
    def setTrustState(value: TrustState): Self = StObject.set(x, "TrustState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustStateReason(value: TrustStateReason): Self = StObject.set(x, "TrustStateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustStateReasonUndefined: Self = StObject.set(x, "TrustStateReason", js.undefined)
    
    @scala.inline
    def setTrustStateUndefined: Self = StObject.set(x, "TrustState", js.undefined)
    
    @scala.inline
    def setTrustType(value: TrustType): Self = StObject.set(x, "TrustType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustTypeUndefined: Self = StObject.set(x, "TrustType", js.undefined)
  }
}
