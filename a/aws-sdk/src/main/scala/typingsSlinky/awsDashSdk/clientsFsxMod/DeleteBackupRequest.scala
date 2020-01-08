package typingsSlinky.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup you want to delete.
    */
  var BackupId: typingsSlinky.awsDashSdk.clientsFsxMod.BackupId = js.native
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is automatically filled on your behalf when using the AWS CLI or SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsFsxMod.ClientRequestToken] = js.native
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId, ClientRequestToken: ClientRequestToken = null): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupRequest]
  }
}

