package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRecordsRequest extends js.Object {
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
  implicit class UpdateRecordsRequestOps[Self <: UpdateRecordsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetName(value: DatasetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityId(value: IdentityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncSessionToken(value: SyncSessionToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientContext(value: ClientContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: DeviceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordPatches(value: RecordPatchList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordPatches")(js.undefined)
        ret
    }
  }
  
}

