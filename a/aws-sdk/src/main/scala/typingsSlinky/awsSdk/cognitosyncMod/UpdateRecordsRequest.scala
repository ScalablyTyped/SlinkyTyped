package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecordsRequest extends StObject {
  
  /**
    * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The ClientContext field is not yet implemented.
    */
  var ClientContext: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.ClientContext] = js.native
  
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: typingsSlinky.awsSdk.cognitosyncMod.DatasetName = js.native
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.DeviceId] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typingsSlinky.awsSdk.cognitosyncMod.IdentityId = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  
  /**
    * A list of patch operations.
    */
  var RecordPatches: js.UndefOr[RecordPatchList] = js.native
  
  /**
    * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
    */
  var SyncSessionToken: typingsSlinky.awsSdk.cognitosyncMod.SyncSessionToken = js.native
}
object UpdateRecordsRequest {
  
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId,
    SyncSessionToken: SyncSessionToken
  ): UpdateRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SyncSessionToken = SyncSessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecordsRequest]
  }
  
  @scala.inline
  implicit class UpdateRecordsRequestMutableBuilder[Self <: UpdateRecordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientContext(value: ClientContext): Self = StObject.set(x, "ClientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContextUndefined: Self = StObject.set(x, "ClientContext", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordPatches(value: RecordPatchList): Self = StObject.set(x, "RecordPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordPatchesUndefined: Self = StObject.set(x, "RecordPatches", js.undefined)
    
    @scala.inline
    def setRecordPatchesVarargs(value: RecordPatch*): Self = StObject.set(x, "RecordPatches", js.Array(value :_*))
    
    @scala.inline
    def setSyncSessionToken(value: SyncSessionToken): Self = StObject.set(x, "SyncSessionToken", value.asInstanceOf[js.Any])
  }
}
