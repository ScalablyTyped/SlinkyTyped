package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreServerRequest extends js.Object {
  /**
    *  The ID of the backup that you want to use to restore a server. 
    */
  var BackupId: typingsSlinky.awsSdk.opsworkscmMod.BackupId = js.native
  /**
    *  The type of instance to restore. Valid values must be specified in the following format: ^([cm][34]|t2).* For example, m5.large. Valid values are m5.large, r5.xlarge, and r5.2xlarge. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    *  The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. 
    */
  var KeyPair: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.KeyPair] = js.native
  /**
    *  The name of the server that you want to restore. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object RestoreServerRequest {
  @scala.inline
  def apply(BackupId: BackupId, ServerName: ServerName): RestoreServerRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreServerRequest]
  }
  @scala.inline
  implicit class RestoreServerRequestOps[Self <: RestoreServerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPair(value: KeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPair")(js.undefined)
        ret
    }
  }
  
}

